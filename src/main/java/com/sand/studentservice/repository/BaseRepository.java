package com.sand.studentservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@NoRepositoryBean
@RepositoryRestResource(exported = false)
public interface BaseRepository<T> extends MongoRepository<T, String> {

//  @Override
//  @RestResource(exported = false)
//  void deleteById(String aLong);
}
