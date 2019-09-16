package com.qstate.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class AnswerList {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
//    @JoinTable(name="answerlists_from_trainee")
    private Trainee trainee;

    @OneToMany
    List<Answer> answers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }


    public double calcIQ() {
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
