package com.qstate.question.service;

import com.qstate.question.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired          //only works on components or subclasses (?) thereof
    QuestionRepository qr;

    public void savequestion(){
        qr.save(new Question());
    }
}
