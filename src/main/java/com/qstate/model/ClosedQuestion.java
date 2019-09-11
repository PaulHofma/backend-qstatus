package com.qstate.model;

import javax.persistence.Entity;

@Entity
public class ClosedQuestion extends Question {
    private double eqWeight;
    private double iqWeight;
    private double sqWeight;
    private double fqWeight;
    private int rangeMin;
    private int rangeMax;

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
}
