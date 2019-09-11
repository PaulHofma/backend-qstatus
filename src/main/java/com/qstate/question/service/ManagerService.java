package com.qstate.question.service;

import com.qstate.question.exceptions.UserIdUnknownException;
import com.qstate.question.model.Manager;
import com.qstate.question.persistence.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository mr;

    public Manager getManager(long id) throws UserIdUnknownException {
        Optional<Manager> foundManager = mr.findById(id);
        if (foundManager.isPresent()) {
            return foundManager.get();
        } else {
            throw new UserIdUnknownException();
        }
    }

    public Iterable<Manager> getAllManagers() {
        return mr.findAll();
    }

    public Manager saveManager(Manager manager) {
        return mr.save(manager);
    }
}
