package com.sand.studentservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;

import com.sand.studentservice.document.Student;

@Configuration
public class StudentRepositoryRestConfigurer implements RepositoryRestConfigurer {

  private static final String BEFORE_CREATE = "beforeCreate";
  private static final String BEFORE_SAVE = "beforeSave";
  private final Validator validator;

  @Autowired
  public StudentRepositoryRestConfigurer(@Qualifier("defaultValidator") Validator validator) {
    this.validator = validator;
  }

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration restConfig) {
    restConfig.disableDefaultExposure();
    restConfig.exposeIdsFor(Student.class);
  }

  @Override
  public void configureValidatingRepositoryEventListener(
      ValidatingRepositoryEventListener validatingListener) {
    validatingListener.addValidator(BEFORE_CREATE, validator);
    validatingListener.addValidator(BEFORE_SAVE, validator);
  }
}
