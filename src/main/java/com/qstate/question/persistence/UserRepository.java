package com.qstate.question.persistence;

import com.qstate.question.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

}