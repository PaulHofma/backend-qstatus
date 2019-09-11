package com.qstate.question.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class AnswerList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "answers_in_answerlist",
            joinColumns = @JoinColumn(name = "answerlist_id"),
            inverseJoinColumns = @JoinColumn(name = "answer_id"))
    private Set<Answer> answerSet;

    @ManyToOne
    @JoinColumn(name="TRAINEE_ID")
    private User trainee; //MAKE TRAINEE

    public AnswerList(Set<Answer> answerSet){
        // constructor
        this.answerSet = answerSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Answer> setAnswerSet(Set<Answer> newAnswerSet) {
        this.answerSet = newAnswerSet;
        return this.answerSet;
    }

    public Set<Answer> getAnswerSet(){
        return this.answerSet;
    }

    public User getTrainee() {
        return trainee;
    }

    public void setTrainee(User trainee) {
        this.trainee = trainee;
    }

    public double calcIQ() {
        //ADD FUNCTIONALITY
        return 0.0;
    }

    public double calcEQ() {
        //ADD FUNCTIONALITY
        return 0.0;
    }

    public double calcSQ() {
        //ADD FUNCTIONALITY
        return 0.0;
    }

    public double calcFQ() {
        //ADD FUNCTIONALITY
        return 0.0;
    }

    public double[] calcQArray(){
        return new double[]{calcIQ(), calcEQ(), calcSQ(), calcFQ()};
    }
}
