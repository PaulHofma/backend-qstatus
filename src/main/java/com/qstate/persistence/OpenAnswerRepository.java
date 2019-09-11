package com.qstate.persistence;

import com.qstate.model.OpenAnswer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface OpenAnswerRepository extends CrudRepository<OpenAnswer, Long> {
}