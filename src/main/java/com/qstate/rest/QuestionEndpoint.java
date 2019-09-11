package com.qstate.rest;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.Question;
import com.qstate.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionEndpoint {
    @Autowired
    QuestionService qs;

    @GetMapping(value="/question/all")
    public Iterable<Question> getAllQuestions() {
        return qs.getAllQuestions();
    }

    @GetMapping(value = "/question/{id}")
    public Question getTrainee(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        return qs.getQuestion(questionid);
    }

}
