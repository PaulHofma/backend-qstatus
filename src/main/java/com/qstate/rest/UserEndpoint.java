package com.qstate.rest;

import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.User;
import com.qstate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserEndpoint {
    @Autowired
    UserService us;

    @GetMapping(value="/user/all")
    public Iterable<User> getAllUsers() {
        return us.getAllUsers();
    }

    @GetMapping(value = "/user/{id}")
    public User getTrainee(@PathVariable(name="id") long userid) throws UserIdUnknownException {
        return us.getUser(userid);
    }

//    @PutMapping(value="user")
//    public User updateUser(@RequestBody User question) throws QuestionIdUnknownException {
//        qs.getQuestion(question.getId()); //check if question exists
//        return qs.saveQuestion(question);
//    }
//
//    @DeleteMapping(value="question/{id}")
//    public Question deleteQuestion(@PathVariable(name="id") long questionid) throws QuestionIdUnknownException {
//        return qs.deleteQuestion(questionid);
//    }

}
