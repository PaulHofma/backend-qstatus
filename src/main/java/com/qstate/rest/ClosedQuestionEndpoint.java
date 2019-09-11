package com.qstate.rest;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.ClosedQuestion;
import com.qstate.service.ClosedQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClosedQuestionEndpoint {

    @Autowired
    ClosedQuestionService cqs;

    @GetMapping(value="/closedquestion/{id}")
    public ClosedQuestion getQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        ClosedQuestion closedQuestion = cqs.getClosedQuestion(questionid);
        return closedQuestion;
    }

    @PostMapping(value="closedquestion")
    public ClosedQuestion postQuestion(@RequestBody ClosedQuestion closedQuestion){
        return cqs.saveClosedQuestion(closedQuestion);
    }

    @PutMapping(value="closedquestion")
    public ClosedQuestion updateQuestion(@RequestBody ClosedQuestion closedQuestion) throws QuestionIdUnknownException {
        cqs.getClosedQuestion(closedQuestion.getId()); //check if question exists
        return cqs.saveClosedQuestion(closedQuestion);
    }

    @DeleteMapping(value="closedquestion/{id}")
    public ClosedQuestion deleteQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        return cqs.deleteClosedQuestion(questionid);
    }
}
