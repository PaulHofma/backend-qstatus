package com.qstate.rest;

import com.qstate.exceptions.QuestionListIdUnknownException;
import com.qstate.model.QuestionList;
import com.qstate.service.QuestionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionListEndpoint {
    @Autowired
    QuestionListService qls;

    @GetMapping(value="/questionList/{id}")
    public QuestionList getQuestionList(@PathVariable(name="id") long questionListId) throws QuestionListIdUnknownException {
        QuestionList questionList = qls.getQuestionList(questionListId);
        return questionList;
    }

    @PostMapping(value="questionList")
    public QuestionList makeQuestionList(@RequestBody QuestionList questionList){
        return qls.saveQuestionList(questionList);
    }

    @PutMapping(value="questionList")
    public QuestionList updateQuestionList(@RequestBody QuestionList questionList) throws QuestionListIdUnknownException {
        qls.getQuestionList(questionList.getId()); //check if questionList exists
        return qls.saveQuestionList(questionList);
    }

    @DeleteMapping(value="questionList/{id}")
    public QuestionList deleteQuestionList(@PathVariable(name="id") long questionListId) throws QuestionListIdUnknownException {
        return qls.deleteQuestionList(questionListId);
    }
}
