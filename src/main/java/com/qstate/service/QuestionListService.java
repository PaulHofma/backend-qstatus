package com.qstate.service;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.exceptions.QuestionListIdUnknownException;
import com.qstate.persistence.QuestionListRepository;
import com.qstate.model.QuestionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionListService {
    @Autowired
    QuestionListRepository qlr;

    public QuestionList saveQuestionList(QuestionList q){
        return qlr.save(q);
    }

    public QuestionList getQuestionList(long questionListId) throws QuestionListIdUnknownException {
        Optional<QuestionList> q = qlr.findById(questionListId);
        if(q.isPresent()){
            return q.get();
        } else {
            throw new QuestionListIdUnknownException();
        }
    }

    public Iterable<QuestionList> getAllQuestionLists() {
        return qlr.findAll();
    }

    public QuestionList deleteQuestionList(long questionListId) throws QuestionListIdUnknownException {
        Optional<QuestionList> q = qlr.findById(questionListId);
        if(q.isPresent()){
            QuestionList questionListToDelete = q.get();
            qlr.delete(questionListToDelete);
            return questionListToDelete;
        } else {
            throw new QuestionListIdUnknownException();
        }
    }

}
