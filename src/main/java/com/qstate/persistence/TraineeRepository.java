package com.qstate.persistence;

import com.qstate.model.Trainee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TraineeRepository extends CrudRepository<Trainee, Long> {
}
