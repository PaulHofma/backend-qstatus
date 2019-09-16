package com.qstate.service;

import com.qstate.exceptions.AnswerIdUnknownException;
import com.qstate.model.ClosedAnswer;
import com.qstate.persistence.ClosedAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClosedAnswerService {
    @Autowired
    ClosedAnswerRepository car;

    public ClosedAnswer getClosedAnswer(long id) throws AnswerIdUnknownException {
        Optional<ClosedAnswer> foundClosedAnswer = car.findById(id);
        if (foundClosedAnswer.isPresent()) {
            return foundClosedAnswer.get();
        } else {
            throw new AnswerIdUnknownException();
        }
    }

    public Iterable<ClosedAnswer> getAllClosedAnswers() {
        return car.findAll();
    }

    public ClosedAnswer saveClosedAnswer(ClosedAnswer closedAnswer) {
        return car.save(closedAnswer);
    }

    public ClosedAnswer deleteClosedAnswer(long answerId) throws AnswerIdUnknownException {
        Optional<ClosedAnswer> a = car.findById(answerId);
        if(a.isPresent()){
            ClosedAnswer closedAnswer_to_delete = a.get();
            car.delete(closedAnswer_to_delete);
            return closedAnswer_to_delete;
        } else {
            throw new AnswerIdUnknownException();
        }
    }
}
