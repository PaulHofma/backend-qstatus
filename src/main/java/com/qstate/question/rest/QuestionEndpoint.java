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

    @GetMapping("questiontest")
    public Question testEndpoint(){
        Question question = new Question("default title", "default text");
        qs.savequestion(question);
        return question;
    }

    @GetMapping(value="/getquestion/{id}")
    public Question getQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        Question question = qs.getquestion(questionid);
        return question;
    }

    @PostMapping(value="postquestion")
    public Question makeQuestion(@RequestBody Question question){
        return qs.savequestion(question);
    }

    @PutMapping(value="updatequestion")
    public Question updateQuestion(@RequestBody Question question) throws QuestionIdUnknownException {
        qs.getquestion(question.getId()); //check if question exists
        return qs.savequestion(question);
    }

    @DeleteMapping(value="deletequestion/{id}")
    public Question deleteQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        return qs.deletequestion(questionid);
    }
}
