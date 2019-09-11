package com.qstate.service;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.ClosedQuestion;
import com.qstate.persistence.ClosedQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClosedQuestionService {
    @Autowired
    ClosedQuestionRepository cqr;

    public ClosedQuestion getClosedQuestion(long id) throws QuestionIdUnknownException {
        Optional<ClosedQuestion> foundClosedQuestion = cqr.findById(id);
        if (foundClosedQuestion.isPresent()) {
            return foundClosedQuestion.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public Iterable<ClosedQuestion> getAllClosedQuestions() {
        return cqr.findAll();
    }

    public ClosedQuestion saveClosedQuestion(ClosedQuestion closedQuestion) {
        return cqr.save(closedQuestion);
    }

    public ClosedQuestion deleteClosedQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<ClosedQuestion> q = cqr.findById(questionId);
        if(q.isPresent()){
            ClosedQuestion closedQuestionToDelete = q.get();
            cqr.delete(closedQuestionToDelete);
            return closedQuestionToDelete;
        } else {
            throw new QuestionIdUnknownException();
        }
    }
}
