package com.qstate.persistence;

import com.qstate.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionRepository extends CrudRepository<Question, Long> {

}