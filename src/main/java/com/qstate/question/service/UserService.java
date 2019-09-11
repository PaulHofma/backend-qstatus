package com.qstate.question.service;

import com.qstate.question.exceptions.UserIdUnknownException;
import com.qstate.question.model.User;
import com.qstate.question.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository ur;

    public Iterable<User> getAllUsers() {
        return ur.findAll();
    }

    public User getUser(long id) throws UserIdUnknownException {
        Optional<User> foundUser = ur.findById(id);
        if (foundUser.isPresent()) {
            return foundUser.get();
        } else {
            throw new UserIdUnknownException();
        }
    }

    public User saveUser(User user){
        return ur.save(user);
    }
}
