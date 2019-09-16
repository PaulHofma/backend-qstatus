package com.qstate.persistence;

import com.qstate.model.AnswerList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AnswerListRepository extends CrudRepository<AnswerList, Long> {
}