package com.qstate.persistence;

import com.qstate.model.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
