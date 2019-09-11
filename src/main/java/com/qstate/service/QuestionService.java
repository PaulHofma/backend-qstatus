package com.qstate.service;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.Question;
import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.Question;
import com.qstate.persistence.QuestionRepository;
import com.qstate.persistence.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository qr;

    public Iterable<Question> getAllQuestions() {
        return qr.findAll();
    }

    public Question getQuestion(long id) throws QuestionIdUnknownException {
        Optional<Question> foundQuestion = qr.findById(id);
        if (foundQuestion.isPresent()) {
            return foundQuestion.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public Question saveQuestion(Question question){
        return qr.save(question);
    }
}
