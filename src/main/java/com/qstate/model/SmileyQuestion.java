package com.qstate.model;

import javax.persistence.Entity;

@Entity
public class SmileyQuestion extends Question {
    private int minRange;
    private int maxRange;

    public SmileyQuestion(){
        this.setQuestionType(QuestionType.SMILEY);
    }

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }
}
