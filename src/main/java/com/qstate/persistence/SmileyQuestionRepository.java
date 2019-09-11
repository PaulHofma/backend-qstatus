package com.qstate.persistence;

import com.qstate.model.SmileyQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SmileyQuestionRepository extends CrudRepository<SmileyQuestion, Long> {
}