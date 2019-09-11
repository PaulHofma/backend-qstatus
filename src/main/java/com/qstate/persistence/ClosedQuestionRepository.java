package com.qstate.persistence;

import com.qstate.model.ClosedQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClosedQuestionRepository extends CrudRepository<ClosedQuestion, Long> {
}