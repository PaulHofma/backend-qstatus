package com.qstate.question.persistence;

import com.qstate.question.model.Trainee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TraineeRepository extends CrudRepository<Trainee, Long> {
}
