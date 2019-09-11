package com.qstate.question.persistence;

import com.qstate.question.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionRepository extends CrudRepository<Question, Long> {

}