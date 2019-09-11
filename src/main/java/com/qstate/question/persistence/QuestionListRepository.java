package com.qstate.question.persistence;

import com.qstate.question.model.QuestionList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionListRepository extends CrudRepository<QuestionList, Long> {

}