package com.qstate.model;

import javax.persistence.Entity;

@Entity
public class OpenQuestion extends Question {
    public OpenQuestion(){
        this.setQuestionType(QuestionType.OPEN);
    }
    public OpenQuestion(String s){
        super(s);
        this.setQuestionType(QuestionType.OPEN);
    }

}


