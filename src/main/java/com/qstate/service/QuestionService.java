package com.qstate.service;

import com.qstate.model.OpenQuestion;
import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.persistence.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository qr;

    public OpenQuestion saveQuestion(OpenQuestion q){
        return qr.save(q);
    }

    public OpenQuestion getQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<OpenQuestion> q = qr.findById(questionId);
        if(q.isPresent()){
            return q.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public OpenQuestion deleteQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<OpenQuestion> q = qr.findById(questionId);
        if(q.isPresent()){
            OpenQuestion openQuestion_to_delete = q.get();
            qr.delete(openQuestion_to_delete);
            return openQuestion_to_delete;
        } else {
            throw new QuestionIdUnknownException();
        }
    }
}
