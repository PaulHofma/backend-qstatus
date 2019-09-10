package com.qstate.question.model;

import javax.persistence.*;

@Entity
public class QState {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="TRAINEE_ID")
    private User trainee; //MAKE TRAINEE

    @OneToOne
    private AnswerList answerList;

    private double iqstate;
    private double eqstate;
    private double sqstate;
    private double fqstate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getTrainee() {
        return trainee;
    }

    public void setTrainee(User trainee) {
        this.trainee = trainee;
    }

    public AnswerList getAnswerList() {
        return answerList;
    }

    public void setAnswerList(AnswerList answerList) {
        this.answerList = answerList;
    }

    public double getIqstate() {
        return iqstate;
    }

    public double getEqstate() {
        return eqstate;
    }

    public double getSqstate() {
        return sqstate;
    }

    public double getFqstate() {
        return fqstate;
    }
}
