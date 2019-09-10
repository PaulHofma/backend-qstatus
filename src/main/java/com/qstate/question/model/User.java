package com.qstate.question.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;

    public long getId(){
        return id;
    }

    public String getUsername() { return username; }

    public String setUsername(String newusername) {
        this.username = newusername;
        return username;
    }
}
