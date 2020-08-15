package com.sand.studentservice.document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.sand.studentservice.constant.DBCollection;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = DBCollection.STUDENT)
public class Student extends BaseDocument {

  @NotNull
  @NotBlank(message = "Please provide a name")
  private String name;
  private int age;
}
