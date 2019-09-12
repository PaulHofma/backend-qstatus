package com.qstate.model;

import javax.persistence.Entity;

@Entity
public class ClosedAnswer extends Answer {
    private int response;

    ClosedAnswer(){}

    ClosedAnswer(int response){
        this.response = response;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}
