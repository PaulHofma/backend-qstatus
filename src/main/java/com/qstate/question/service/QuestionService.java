package com.qstate.question.service;

import com.qstate.question.exceptions.QuestionIdUnknownException;
import com.qstate.question.model.Question;
import com.qstate.question.persistence.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired          //only works on components or subclasses (?) thereof
            QuestionRepository qr;

    public Question saveQuestion(Question q){
        return qr.save(q);
    }

    public Question getQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<Question> q = qr.findById(questionId);
        if(q.isPresent()){
            return q.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }

    public Question deleteQuestion(long questionId) throws QuestionIdUnknownException {
        Optional<Question> q = qr.findById(questionId);
        if(q.isPresent()){
            Question question_to_delete = q.get();
            qr.delete(question_to_delete);
            return question_to_delete;
        } else {
            throw new QuestionIdUnknownException();
        }
    }
}
