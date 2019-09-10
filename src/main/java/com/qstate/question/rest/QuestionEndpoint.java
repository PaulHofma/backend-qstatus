package com.qstate.question.rest;

import com.qstate.question.model.Question;
import com.qstate.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionEndpoint {

    @Autowired
    QuestionService qs;

    @GetMapping("question")
    public Question testEndpoint(){
//        System.out.println("new question");
        Question question = new Question();
        question.setText("default text");
        question.setTitle("default title");
        qs.savequestion();
        return question;
    }
}
