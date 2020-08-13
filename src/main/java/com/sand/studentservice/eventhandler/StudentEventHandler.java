//package com.sand.studentservice.eventhandler;
//
//import javax.validation.Valid;
//
//import org.springframework.data.rest.core.annotation.HandleAfterCreate;
//import org.springframework.data.rest.core.annotation.HandleAfterDelete;
//import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
//import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
//import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.annotation.Validated;
//
//import com.sand.studentservice.document.Student;
//
//import lombok.extern.log4j.Log4j2;
//
//@Log4j2
//@Component
//@RepositoryEventHandler
//@Validated
//public class StudentEventHandler {
//
//  @HandleBeforeCreate
//  public void handleStudentBeforeCreate(@Valid Student student) {
//    log.info("Inside Student Before Create....");
//  }
//
//  @HandleAfterCreate
//  public void handleStudentAfterCreate(Student student) {
//    log.info("Inside Student After Create ....");
//  }
//
//  @HandleBeforeDelete
//  public void handleStudentBeforeDelete(Student student) {
//    log.info("Inside Student Before Delete ....");
//  }
//
//  @HandleAfterDelete
//  public void handleStudentAfterDelete(Student student) {
//    log.info("Inside Student After Delete ....");
//  }
//
//}
