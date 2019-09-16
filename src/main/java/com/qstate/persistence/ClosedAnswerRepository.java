package com.qstate.persistence;

import com.qstate.model.ClosedAnswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClosedAnswerRepository extends CrudRepository<ClosedAnswer, Long> {
}