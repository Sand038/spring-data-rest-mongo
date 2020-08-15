package com.sand.studentservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sand.studentservice.document.Student;

@RepositoryRestResource(collectionResourceRel = "student-resource", path = "students")
public interface StudentRepository extends BaseRepository<Student> {

  @RestResource
  Page<Student> findByName(String name, Pageable pageable);

  @RestResource
  Page<Student> findByAge(int age, Pageable pageable);
}
