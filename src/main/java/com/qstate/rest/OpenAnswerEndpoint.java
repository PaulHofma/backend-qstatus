package com.qstate.rest;

import com.qstate.exceptions.AnswerIdUnknownException;
import com.qstate.exceptions.AnswerIdUnknownException;
import com.qstate.model.OpenAnswer;
import com.qstate.service.OpenAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OpenAnswerEndpoint {
    @Autowired
    OpenAnswerService oas;

    @GetMapping(value="/openanswer/{id}")
    public OpenAnswer getAnswer(@PathVariable(name="id") long answerid) throws AnswerIdUnknownException {
        OpenAnswer openAnswer = oas.getOpenAnswer(answerid);
        return openAnswer;
    }

    @PostMapping(value="openanswer")
    public OpenAnswer makeAnswer(@RequestBody OpenAnswer openAnswer){
        return oas.saveOpenAnswer(openAnswer);
    }

    @PutMapping(value="openanswer")
    public OpenAnswer updateAnswer(@RequestBody OpenAnswer openAnswer) throws AnswerIdUnknownException {
        oas.getOpenAnswer(openAnswer.getId()); //check if answer exists
        return oas.saveOpenAnswer(openAnswer);
    }

    @DeleteMapping(value="openanswer/{id}")
    public OpenAnswer deleteAnswer(@PathVariable(name="id") long answerid) throws AnswerIdUnknownException {
        return oas.deleteOpenAnswer(answerid);
    }
}
