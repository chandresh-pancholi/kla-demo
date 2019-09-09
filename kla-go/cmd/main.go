package main

import (
	"context"
	pb "github.com/chandresh-pancholi/kla-demo/proto"
	"github.com/golang/protobuf/ptypes/empty"
	"google.golang.org/grpc"
	"io"
	"log"
	"time"
)

func main() {
	conn, err := grpc.Dial("localhost:9090", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("fail to dial: %v", err)
	}

	defer conn.Close()

	client := pb.NewKLAServiceClient(conn)

	createSession(client)

	//printSessionDetails(client)

	//createSessionInBulk(client)
}

func createSession( client pb.KLAServiceClient)  {
	ctx, cancel := context.WithTimeout(context.Background(), 10 * time.Second)
	defer cancel()

	resp, err := client.CreateSessionDetail(ctx, &pb.CreateSessionDetailRequest{Name: "test", Talk: "Introduction to test", Abstract: "", TalkTime: 100})
	if err != nil {
		log.Fatalf("create session detail failed. error %v ", err)
	}

	log.Printf("%v", resp)
}
func printSessionDetails(client pb.KLAServiceClient) {
	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()

	stream, err := client.GetSessionDetails(ctx, &empty.Empty{})
	if err != nil {
		log.Fatalf("%v.GetSessionDetails(_) = _, %v", client, err)
	}

	for {
		session, err := stream.Recv()
		if err == io.EOF {
			break
		}
		if err != nil {
			log.Fatalf("%v.GetSessionDetails(_) = _, %v", client, err)
		}
		log.Println(session)
	}
}

func createSessionInBulk(client pb.KLAServiceClient) {
	sessions := []*pb.CreateSessionDetailRequest{
		{Name: "Chandresh", Talk: "Introduction to gRPC", Abstract: "Abstract 1", TalkTime: 1200},
		{Name: "Rahul", Talk: "Introduction to Golang", Abstract: "Abstract 2", TalkTime: 1200},
		{Name: "Rajeev", Talk: "Introduction to Node.js", Abstract: "Abstract 3", TalkTime: 1200},
		{Name: "Anjali", Talk: "Introduction to Python", Abstract: "Abstract 4", TalkTime: 1200},
		{Name: "Preethi", Talk: "Introduction to Elasticsearch", Abstract: "Abstract 5", TalkTime: 1200},
		{Name: "Prateek", Talk: "Introduction to Spring boot", Abstract: "Abstract 6", TalkTime: 1200},
	}

	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()

	stream, err := client.CreateSessionInBulk(ctx)
	if err != nil {
		log.Fatalf("%v.CreateSessionInBulk(_) = _, %v", client, err)
	}

	waitc := make(chan struct{})
	go func() {
		for {
			in, err := stream.Recv()
			if err == io.EOF {
				// read done.
				close(waitc)
				return
			}
			if err != nil {
				log.Fatalf("Failed to receive a session : %v", err)
			}
			log.Printf("Got message %s", in.String())
		}
	}()

	for _, session := range sessions {
		if err := stream.Send(session); err != nil {
			log.Fatalf("Failed to send a session: %v", err)
		}
	}
	stream.CloseSend()
	<-waitc
}
