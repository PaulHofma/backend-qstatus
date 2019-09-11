package com.qstate.service;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.persistence.QuestionListRepository;
import com.qstate.model.QuestionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionListService {
    @Autowired          //only works on components or subclasses (?) thereof
            QuestionListRepository qlr;

    public QuestionList saveQuestion(QuestionList q){
        return qlr.save(q);
    }

    public QuestionList getQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<QuestionList> q = qlr.findById(questionId);
        if(q.isPresent()){
            return q.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public QuestionList deleteQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<QuestionList> q = qlr.findById(questionId);
        if(q.isPresent()){
            QuestionList question_to_delete = q.get();
            qlr.delete(question_to_delete);
            return question_to_delete;
        } else {
            throw new QuestionIdUnknownException();
        }
    }

}
