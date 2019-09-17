package com.qstate.rest;

import com.qstate.exceptions.AnswerListIdUnknownException;
import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.AnswerList;
import com.qstate.model.QState;
import com.qstate.model.Trainee;
import com.qstate.service.AnswerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestController
public class AnswerListEndpoint {
    @Autowired
    AnswerListService als;

    @GetMapping(value="/answerlist/{id}")
    public AnswerList getAnswer(@PathVariable(name="id") long answerListId) throws AnswerListIdUnknownException {
        AnswerList answerList = als.getAnswerList(answerListId);
        return answerList;
    }

    @GetMapping(value="/answerlist/{trainee_id}/q")
    public QState getQStatesById(@PathVariable long trainee_id) throws UserIdUnknownException {
        List<AnswerList> answerList = als.getMostRecentAnswerList(trainee_id);
        Iterator<AnswerList> answers = answerList.iterator();
        return new QState(answers.next());
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
