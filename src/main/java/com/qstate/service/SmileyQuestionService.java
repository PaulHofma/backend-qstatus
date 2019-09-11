package com.qstate.service;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.SmileyQuestion;
import com.qstate.persistence.SmileyQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmileyQuestionService {
    @Autowired
    SmileyQuestionRepository sqr;

    public SmileyQuestion getSmileyQuestion(long id) throws QuestionIdUnknownException {
        Optional<SmileyQuestion> foundSmileyQuestion = sqr.findById(id);
        if (foundSmileyQuestion.isPresent()) {
            return foundSmileyQuestion.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public Iterable<SmileyQuestion> getAllSmileyQuestions() {
        return sqr.findAll();
    }

    public SmileyQuestion saveSmileyQuestion(SmileyQuestion smileyQuestion) {
        return sqr.save(smileyQuestion);
    }

    public SmileyQuestion deleteSmileyQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<SmileyQuestion> q = sqr.findById(questionId);
        if(q.isPresent()){
            SmileyQuestion smileyQuestionToDelete = q.get();
            sqr.delete(smileyQuestionToDelete);
            return smileyQuestionToDelete;
        } else {
            throw new QuestionIdUnknownException();
        }
    }
}
