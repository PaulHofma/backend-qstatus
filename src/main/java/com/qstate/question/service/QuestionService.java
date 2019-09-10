package com.qstate.question.service;

import com.qstate.question.exceptions.QuestionIdUnknownException;
import com.qstate.question.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired          //only works on components or subclasses (?) thereof
    QuestionRepository qr;

    public Question savequestion(Question q){
        return qr.save(q);
    }

    public Question getquestion(long questionid) throws QuestionIdUnknownException {
        Optional<Question> q = qr.findById(questionid);
        if(q.isPresent()){
            return q.get();
        } else {
            throw new QuestionIdUnknownException();
        }
    }
}
