package com.sand.studentservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sand.studentservice.constant.DBCollection;

import lombok.Data;

@Data
@Document(collection = DBCollection.STUDENT)
public class Student {

  @Id
  private String id;
  private String name;
  private int age;
}
