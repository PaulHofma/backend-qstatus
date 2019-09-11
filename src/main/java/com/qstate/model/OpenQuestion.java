package com.qstate.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



//saved to database!
@Entity
public class OpenQuestion {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    private String text;

    public OpenQuestion(){
        //empty constructor
    }

    public OpenQuestion(String text){
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


