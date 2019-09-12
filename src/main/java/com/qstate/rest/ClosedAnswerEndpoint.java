package com.qstate.rest;

import com.qstate.exceptions.AnswerIdUnknownException;
import com.qstate.model.ClosedAnswer;
import com.qstate.service.ClosedAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClosedAnswerEndpoint {
    @Autowired
    ClosedAnswerService cas;

    @GetMapping(value="/closedanswer/{id}")
    public ClosedAnswer getAnswer(@PathVariable(name="id") long answerid) throws AnswerIdUnknownException {
        ClosedAnswer closedAnswer = cas.getClosedAnswer(answerid);
        return closedAnswer;
    }

    @PostMapping(value="closedanswer")
    public ClosedAnswer makeAnswer(@RequestBody ClosedAnswer closedAnswer){
        return cas.saveClosedAnswer(closedAnswer);
    }

    @PutMapping(value="closedanswer")
    public ClosedAnswer updateAnswer(@RequestBody ClosedAnswer closedAnswer) throws AnswerIdUnknownException {
        cas.getClosedAnswer(closedAnswer.getId()); //check if answer exists
        return cas.saveClosedAnswer(closedAnswer);
    }

    @DeleteMapping(value="closedanswer/{id}")
    public ClosedAnswer deleteAnswer(@PathVariable(name="id") long answerid) throws AnswerIdUnknownException {
        return cas.deleteClosedAnswer(answerid);
    }
}
