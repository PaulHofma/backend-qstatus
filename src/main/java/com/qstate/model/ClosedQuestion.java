package com.qstate.model;

import javax.persistence.Entity;

@Entity
public class ClosedQuestion extends Question {
    private double eqWeight;
    private double iqWeight;
    private double sqWeight;
    private double fqWeight;
    private int rangeMin; // default range = 0-4!
    private int rangeMax;

    public ClosedQuestion(){
        this.rangeMin = 0;
        this.rangeMax = 4;
        this.setQuestionType(QuestionType.CLOSED);
    }

    public ClosedQuestion(String text, double eqWeight, double iqWeight, double sqWeight, double fqWeight,
                          int rangeMin, int rangeMax){
        this.setText(text);
        this.eqWeight = eqWeight;
        this.iqWeight = iqWeight;
        this.sqWeight = sqWeight;
        this.fqWeight = fqWeight;
        this.rangeMin = rangeMin;
        this.rangeMax = rangeMax;
        this.setQuestionType(QuestionType.CLOSED);
    }

    public double getEqWeight() {
        return eqWeight;
    }

    public void setEqWeight(double eqWeight) {
        this.eqWeight = eqWeight;
    }

    public double getIqWeight() {
        return iqWeight;
    }

    public void setIqWeight(double iqWeight) {
        this.iqWeight = iqWeight;
    }

    public double getSqWeight() {
        return sqWeight;
    }

    public void setSqWeight(double sqWeight) {
        this.sqWeight = sqWeight;
    }

    public double getFqWeight() {
        return fqWeight;
    }

    public void setFqWeight(double fqWeight) {
        this.fqWeight = fqWeight;
    }

    public int getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(int rangeMin) {
        this.rangeMin = rangeMin;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(int rangeMax) {
        this.rangeMax = rangeMax;
    }

    public int getRange(){
        return rangeMax - rangeMin;
    }
}
