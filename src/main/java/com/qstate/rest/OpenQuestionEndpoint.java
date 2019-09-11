package com.qstate.rest;

import com.qstate.exceptions.QuestionIdUnknownException;
import com.qstate.model.OpenQuestion;
import com.qstate.service.OpenQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OpenQuestionEndpoint {

    @Autowired
    OpenQuestionService oqs;

    @GetMapping(value="/openquestion/{id}")
    public OpenQuestion getQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        OpenQuestion openQuestion = oqs.getOpenQuestion(questionid);
        return openQuestion;
    }

    @PostMapping(value="openquestion")
    public OpenQuestion postQuestion(@RequestBody OpenQuestion openQuestion){
        return oqs.saveOpenQuestion(openQuestion);
    }

    @PutMapping(value="openquestion")
    public OpenQuestion updateQuestion(@RequestBody OpenQuestion openQuestion) throws QuestionIdUnknownException {
        oqs.getOpenQuestion(openQuestion.getId()); //check if question exists
        return oqs.saveOpenQuestion(openQuestion);
    }

    @DeleteMapping(value="openquestion/{id}")
    public OpenQuestion deleteQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
        return oqs.deleteOpenQuestion(questionid);
    }
}
