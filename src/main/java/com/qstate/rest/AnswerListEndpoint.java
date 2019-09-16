package com.qstate.rest;

import com.qstate.exceptions.AnswerIdUnknownException;
import com.qstate.exceptions.AnswerListIdUnknownException;
import com.qstate.model.AnswerList;
import com.qstate.service.AnswerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnswerListEndpoint {
    @Autowired
    AnswerListService als;

    @GetMapping(value="/answerlist/{id}")
    public AnswerList getAnswer(@PathVariable(name="id") long answerListId) throws AnswerListIdUnknownException {
        AnswerList answerList = als.getAnswerList(answerListId);
        return answerList;
    }

    @PostMapping(value="answerlist")
    public AnswerList makeAnswer(@RequestBody AnswerList answerList){
        return als.saveAnswerList(answerList);
    }

    @PutMapping(value="answerlist")
    public AnswerList updateAnswer(@RequestBody AnswerList answerList) throws AnswerListIdUnknownException {
        als.getAnswerList(answerList.getId()); //check if answer exists
        return als.saveAnswerList(answerList);
    }

    @DeleteMapping(value="answerlist/{id}")
    public AnswerList deleteAnswer(@PathVariable(name="id") long answerListId) throws AnswerListIdUnknownException {
        return als.deleteAnswerList(answerListId);
    }
}
