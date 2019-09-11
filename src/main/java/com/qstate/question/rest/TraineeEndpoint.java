package com.qstate.question.rest;

import com.qstate.question.exceptions.UserIdUnknownException;
import com.qstate.question.model.Trainee;
import com.qstate.question.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TraineeEndpoint {
    @Autowired
    TraineeService ts;

    @GetMapping(value="/trainee/all")
    public Iterable<Trainee> getAllTrainees() {
        return ts.getAllTrainees();
    }

    @GetMapping(value = "/trainee/{id}")
    public Trainee getTrainee(@PathVariable(name="id") long userid) throws UserIdUnknownException {
        return ts.getTrainee(userid);
    }

    @PostMapping(value = "/trainee")
    public Trainee postTrainee(@RequestBody Trainee trainee){
        return ts.saveTrainee(trainee);
    }
}
