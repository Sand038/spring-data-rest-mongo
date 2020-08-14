package com.sand.studentservice.repository;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sand.studentservice.document.Student;

@RepositoryRestResource(collectionResourceRel = "student-resource", path = "students")
public interface StudentRepository extends BaseRepository<Student> {

  List<Student> findByName(String name);

//  @Override
//  @RestResource(exported = false)
//  void deleteById(String aLong);
}
