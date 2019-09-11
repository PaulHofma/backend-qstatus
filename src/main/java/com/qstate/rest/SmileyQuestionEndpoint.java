package com.qstate.rest;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.SmileyQuestion;
import com.qstate.service.SmileyQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SmileyQuestionEndpoint {

    @Autowired
    SmileyQuestionService sqs;

    @GetMapping(value="/smileyquestion/{id}")
    public SmileyQuestion getQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        SmileyQuestion smileyQuestion = sqs.getSmileyQuestion(questionid);
        return smileyQuestion;
    }

    @PostMapping(value="smileyquestion")
    public SmileyQuestion postQuestion(@RequestBody SmileyQuestion smileyQuestion){
        return sqs.saveSmileyQuestion(smileyQuestion);
    }

    @PutMapping(value="smileyquestion")
    public SmileyQuestion updateQuestion(@RequestBody SmileyQuestion smileyQuestion) throws QuestionIdUnknownException {
        sqs.getSmileyQuestion(smileyQuestion.getId()); //check if question exists
        return sqs.saveSmileyQuestion(smileyQuestion);
    }

    @DeleteMapping(value="smileyquestion/{id}")
    public SmileyQuestion deleteQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        return sqs.deleteSmileyQuestion(questionid);
    }
}
