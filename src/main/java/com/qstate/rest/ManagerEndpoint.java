package com.qstate.rest;

import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.Manager;
import com.qstate.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManagerEndpoint {
    @Autowired
    ManagerService ms;

    @GetMapping(value="/manager/all")
    public Iterable<Manager> getAllManagers() {
        return ms.getAllManagers();
    }

    @GetMapping(value = "/manager/{id}")
    public Manager getManager(@PathVariable(name="id") long userid) throws UserIdUnknownException {
        return ms.getManager(userid);
    }

    @PostMapping(value = "/manager")
    public Manager postManager(@RequestBody Manager manager){
        return ms.saveManager(manager);
    }
}
