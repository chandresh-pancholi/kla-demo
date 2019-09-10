# KLA Demo

#### Project structure
```aidl
kla-go --- // grpc client example
kla-java --- // grpc server example
README
```

#### Installation steps
1. `Install Java 8`
2. `Install Golang 1.13`
3. `brew install protobuf`
4. `go get -u github.com/golang/protobuf/protoc-gen-go`
5. `go install github.com/golang/protobuf/protoc-gen-go`
6. `export PATH=$PATH:$HOME/go/bin`
7. `cd kla-java; gradle clean build // it will auto generate java code`
8. `cd kla-go/proto`
9. `protoc --go_out=plugins=grpc:. *.proto // it will generate go code`
10. `Run Java code from IntelliJ`
11. `go build cmd/main.go; ./main`

### Database schema
`1. Create database name as kla`
```aidl
CREATE TABLE `session` (
  `session_id` varchar(36) NOT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `talk` varchar(50) DEFAULT NULL,
  `abstract` varchar(50) NOT NULL,
  `session_time` int(64) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`session_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

### Technology stack
```aidl
1. Java
2. Golang
3. gRPC
4. Spring boot
5. ProtoBuf
6. Gradle
7. MySQL 
```

