package com.qstate.question.service;

import com.qstate.question.exceptions.UserIdUnknownException;
import com.qstate.question.model.Trainee;
import com.qstate.question.persistence.TraineeRepository;
import com.qstate.question.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TraineeService {
    @Autowired
    TraineeRepository tr;

    public Trainee getTrainee(long id) throws UserIdUnknownException {
        Optional<Trainee> foundTrainee = tr.findById(id);
        if (foundTrainee.isPresent()) {
            return foundTrainee.get();
        } else {
            throw new UserIdUnknownException();
        }
    }

    public Iterable<Trainee> getAllTrainees() {
        return tr.findAll();
    }

    public Trainee saveTrainee(Trainee trainee) {
        return tr.save(trainee);
    }
}
