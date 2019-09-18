package com.qstate.model;

public class QState {
    private double iq_state;
    private double eq_state;
    private double fq_state;
    private double sq_state;

    public QState(){}

    public QState(AnswerList answerList){
        this.iq_state = answerList.calcIQ();
        this.eq_state = answerList.calcEQ();
        this.fq_state = answerList.calcFQ();
        this.sq_state = answerList.calcSQ();
    }

    public double getIq_state() {
        return iq_state;
    }

    public void setIq_state(double iq_state) {
        this.iq_state = iq_state;
    }

    public double getEq_state() {
        return eq_state;
    }

    public void setEq_state(double eq_state) {
        this.eq_state = eq_state;
    }

    public double getFq_state() {
        return fq_state;
    }

    public void setFq_state(double fq_state) {
        this.fq_state = fq_state;
    }

    public double getSq_state() {
        return sq_state;
    }

    public void setSq_state(double sq_state) {
        this.sq_state = sq_state;
    }
}
