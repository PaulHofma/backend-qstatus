package com.qstate.question.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long questionid;

    public long getId() {
        return id;
    }

    public long getQuestionid() {
        return questionid;
    }

    public long setId(long id) {
        this.id = id;
        return id;
    }

    public long setQuestionid(long questionid) {
        this.questionid = questionid;
        return questionid;
    }
}
