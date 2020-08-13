package com.sand.studentservice.document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sand.studentservice.constant.DBCollection;

import lombok.Data;

@Data
@Document(collection = DBCollection.STUDENT)
public class Student {

  @Id
  private ObjectId id;
  @NotNull
  @NotBlank(message = "Please provide a name")
  private String name;
  private int age;
}
