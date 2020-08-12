package com.sand.studentservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sand.studentservice.document.Student;

@RepositoryRestResource(collectionResourceRel = "student-resource", path = "student")
public interface StudentRepository extends MongoRepository<Student, String> {

  //  @RestResource(path = "byName/{name}", rel = "student")
  List<Student> findByName(String name);

//  @RestResource(exported = false)
//  void deleteAll();

}
