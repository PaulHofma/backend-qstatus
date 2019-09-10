package com.qstate.question.rest;

import com.qstate.question.exceptions.QuestionIdUnknownException;
import com.qstate.question.model.Question;
import com.qstate.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class QuestionEndpoint {

    @Autowired
    QuestionService qs;

    @GetMapping("question")
    public Question testEndpoint(){
        Question question = new Question("default title", "default text");
        qs.savequestion(question);
        return question;
    }

    @GetMapping(value="/question/{id}")
    public Question getQuestion(@PathVariable(name="id") long questionid) {
        try {
            Question question = qs.getquestion(questionid);
            return question;
        } catch(QuestionIdUnknownException e){
            System.out.println("The requested id does not match a question");
            return new Question();
        }
    }

    @PostMapping
    public Question makeQuestion(String title, String text){
        Question q = new Question(title, text);
        qs.savequestion(q);
        return q;
    }
}
