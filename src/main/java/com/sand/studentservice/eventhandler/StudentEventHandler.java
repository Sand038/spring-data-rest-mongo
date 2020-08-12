package com.sand.studentservice.eventhandler;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.sand.studentservice.document.Student;


@RepositoryEventHandler
public class StudentEventHandler {

  @HandleBeforeSave
  public void handleBeforeSave(Student student) {
    student.setName("handleBeforeSave");
    System.out.println("==========================================");
    System.out.println("================== handleBeforeSave ========================");
    System.out.println("==========================================");
  }

  @HandleBeforeCreate
  public void handleBeforeCreate(Student student) {
    student.setName("handleBeforeCreate");
    System.out.println("==========================================");
    System.out.println("================== handleBeforeCreate ========================");
    System.out.println("==========================================");
  }
}
