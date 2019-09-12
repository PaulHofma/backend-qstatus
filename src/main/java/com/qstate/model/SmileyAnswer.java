package com.qstate.model;

import javax.persistence.Entity;

@Entity
public class SmileyAnswer extends Answer {
    private int response;

    SmileyAnswer(){}

    SmileyAnswer(int response){
        this.response = response;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}
