package com.qstate.persistence;

import com.qstate.model.QuestionList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface QuestionListRepository extends CrudRepository<QuestionList, Long> {

}