package com.qstate.question.service;

import com.qstate.question.model.QuestionList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionListRepository extends CrudRepository<QuestionList, Long> {

}
