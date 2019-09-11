package com.qstate.question.rest;

import com.qstate.question.exceptions.UserIdUnknownException;
import com.qstate.question.model.User;
import com.qstate.question.service.UserService;
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

    @GetMapping(value="/user/{id}")
    public User getUser(@PathVariable(name="id") long userid) throws UserIdUnknownException {
        return us.getUser(userid);
    }

    @PostMapping(value="user")
    public User makeUser(@RequestBody User user){
        return us.saveUser(user);
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
