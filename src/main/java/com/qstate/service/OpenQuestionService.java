package com.qstate.service;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.OpenQuestion;
import com.qstate.persistence.OpenQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OpenQuestionService {
    @Autowired
    OpenQuestionRepository oqr;

    public OpenQuestion getOpenQuestion(long id) throws QuestionIdUnknownException {
        Optional<OpenQuestion> foundOpenQuestion = oqr.findById(id);
        if (foundOpenQuestion.isPresent()) {
            return foundOpenQuestion.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public Iterable<OpenQuestion> getAllOpenQuestions() {
        return oqr.findAll();
    }

    public OpenQuestion saveOpenQuestion(OpenQuestion openQuestion) {
        return oqr.save(openQuestion);
    }

    public OpenQuestion deleteOpenQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<OpenQuestion> q = oqr.findById(questionId);
        if(q.isPresent()){
            OpenQuestion openQuestion_to_delete = q.get();
            oqr.delete(openQuestion_to_delete);
            return openQuestion_to_delete;
        } else {
            throw new QuestionIdUnknownException();
        }
    }
}
