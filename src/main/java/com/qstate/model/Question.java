package com.qstate.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    private String text;

    public Question(){
        //empty constructor
    }

    public Question(String text){
        //simple constructor
        this.text = text;
    }

    public long getId(){
        return this.id;
    }

    public String getText(){
        return this.text;
    }

    public String setText(String newtext){
        this.text = newtext;
        return this.text;
    }
}
