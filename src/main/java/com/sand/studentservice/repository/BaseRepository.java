package com.sand.studentservice.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RestResource;

@NoRepositoryBean
public interface BaseRepository<T> extends MongoRepository<T, ObjectId> {

  @Override
  @RestResource
  Page<T> findAll(Pageable pageable);

  @Override
  @RestResource
  Optional<T> findById(ObjectId id);

  @Override
  @RestResource
  <S extends T> S save(S entity);
}
