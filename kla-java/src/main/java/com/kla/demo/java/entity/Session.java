package com.kla.demo.java.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "session")
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Session {

  @Id
  @Column(name = "session_id")
  String sessionId;

  @Column(name = "name")
  String name;

  @Column(name = "talk")
  String talk;

  @Column(name = "abstract")
  String abstractTalk;

  @Column(name = "session_time")
  Long talkTime;

  @Column(name = "created_at")
  Timestamp createdAt;

  @Column(name = "updated_at")
  Timestamp updatedAt;
}
