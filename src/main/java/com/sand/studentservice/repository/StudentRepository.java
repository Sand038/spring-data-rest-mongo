package com.sand.studentservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sand.studentservice.document.Student;

//@RepositoryRestResource(collectionResourceRel = "student-resource", path = "students")
public interface StudentRepository extends MongoRepository<Student, String> {

  List<Student> findByName(String name);

//  @Override
//  @RestResource(exported = false)
//  void deleteById(String aLong);
}
