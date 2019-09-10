package com.qstate.question.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



//saved to database!
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


