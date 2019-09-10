package com.qstate.question.rest;

import com.qstate.question.model.Question;
import com.qstate.question.model.QuestionList;
import com.qstate.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TESTINGENDPOINT {
    @Autowired
    QuestionService qs;

    @GetMapping("questionlisttest")
    public QuestionList testEndpoint(){
        QuestionList ql = new QuestionList();
        qs.savequestion(ql);
        return question;
    }
}

lalalala