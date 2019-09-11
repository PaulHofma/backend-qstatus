package com.qstate.persistence;

import com.qstate.model.OpenQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionRepository extends CrudRepository<OpenQuestion, Long> {

}