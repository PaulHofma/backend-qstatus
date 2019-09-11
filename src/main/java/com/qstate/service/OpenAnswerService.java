package com.qstate.service;

import com.qstate.exceptions.AnswerIdUnknownException;
import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.OpenAnswer;
import com.qstate.persistence.OpenAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OpenAnswerService {
    @Autowired
    OpenAnswerRepository oar;

    public OpenAnswer getOpenAnswer(long id) throws AnswerIdUnknownException {
        Optional<OpenAnswer> foundOpenAnswer = oar.findById(id);
        if (foundOpenAnswer.isPresent()) {
            return foundOpenAnswer.get();
        } else {
            throw new AnswerIdUnknownException();
        }
    }

    public Iterable<OpenAnswer> getAllOpenAnswers() {
        return oar.findAll();
    }

    public OpenAnswer saveOpenAnswer(OpenAnswer openAnswer) {
        return oar.save(openAnswer);
    }

    public OpenAnswer deleteOpenAnswer(long answerId) throws AnswerIdUnknownException {
        Optional<OpenAnswer> a = oar.findById(answerId);
        if(a.isPresent()){
            OpenAnswer openAnswer_to_delete = a.get();
            oar.delete(openAnswer_to_delete);
            return openAnswer_to_delete;
        } else {
            throw new AnswerIdUnknownException();
        }
    }
}
