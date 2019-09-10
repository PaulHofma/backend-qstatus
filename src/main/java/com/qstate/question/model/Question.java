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
    private String title;
    private String text;

    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getText(){
        return text;
    }

    public String setTitle(String newtitle){
        title = newtitle;
        return newtitle;
    }

    public String setText(String newtext){
        text = newtext;
        return newtext;
    }
}


