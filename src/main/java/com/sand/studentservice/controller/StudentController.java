package com.sand.studentservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sand.studentservice.document.Student;
import com.sand.studentservice.repository.StudentRepository;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

  private final StudentRepository studentRepository;

  @Autowired
  public StudentController(final StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @GetMapping("/customAllStudents")
  public ResponseEntity<Page<Student>> customFindAll(Pageable pageable) {
    return ResponseEntity.ok().body(studentRepository.findAll(pageable));
  }

  @PostMapping("/customSave")
  public ResponseEntity<Student> customSave(@Valid @RequestBody Student student) {
    return ResponseEntity.ok().body(studentRepository.save(student));
  }
}
