package com.qstate.question.rest;

import com.qstate.question.exceptions.QuestionIdUnknownException;
import com.qstate.question.model.Question;
import com.qstate.question.model.QuestionList;
import com.qstate.question.service.QuestionListService;
import com.qstate.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionListEndpoint {
    @Autowired
    QuestionListService qls;

//    @GetMapping(value="/question/{id}")
//    public Question getQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
//        Question question = qls.getQuestionList(questionListId);
//        return question;
//    }
//
//    @PostMapping(value="question")
//    public Question makeQuestion(@RequestBody Question question){
//        return qs.savequestion(question);
//    }
//
//    @PutMapping(value="question")
//    public Question updateQuestion(@RequestBody Question question) throws QuestionIdUnknownException {
//        qs.getquestion(question.getId()); //check if question exists
//        return qs.savequestion(question);
//    }
//
//    @DeleteMapping(value="question/{id}")
//    public Question deleteQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
//        return qs.deletequestion(questionid);
//    }
}
