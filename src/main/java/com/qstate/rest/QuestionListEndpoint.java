package com.qstate.rest;

import com.qstate.exceptions.QuestionListIdUnknownException;
import com.qstate.model.Question;
import com.qstate.model.QuestionList;
import com.qstate.service.QuestionListService;
import com.qstate.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionListEndpoint {
    @Autowired
    QuestionListService qls;
    @Autowired
    QuestionService qs;

    @PostMapping(value="questionlist/test")
    public QuestionList testQuestionList() {
        List<Question> ql = new ArrayList<Question>();
        ql.add(qs.saveQuestion(new Question("Dit is vraag 1")));
        ql.add(qs.saveQuestion(new Question("Dit is vraag 2")));
        ql.add(qs.saveQuestion(new Question("Dit is vraag 3")));
        QuestionList questionList = new QuestionList();
        questionList.setQuestionList(ql);
        return qls.saveQuestionList(questionList);
    }

    @GetMapping(value="/questionlist/{id}")
    public QuestionList getQuestionList(@PathVariable(name="id") long questionListId) throws QuestionListIdUnknownException {
        QuestionList questionList = qls.getQuestionList(questionListId);
        return questionList;
    }

    @PostMapping(value="questionlist")
    public QuestionList makeQuestionList(@RequestBody QuestionList questionList){
        return qls.saveQuestionList(questionList);
    }

    @PutMapping(value="questionlist")
    public QuestionList updateQuestionList(@RequestBody QuestionList questionList) throws QuestionListIdUnknownException {
        qls.getQuestionList(questionList.getId()); //check if questionList exists
        return qls.saveQuestionList(questionList);
    }

    @DeleteMapping(value="questionlist/{id}")
    public QuestionList deleteQuestionList(@PathVariable(name="id") long questionListId) throws QuestionListIdUnknownException {
        return qls.deleteQuestionList(questionListId);
    }
}
