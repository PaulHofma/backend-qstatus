package com.qstate.service;

import com.qstate.persistence.ManagerRepository;
import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.Manager;
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
