package com.qstate.question.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class QuestionList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    Set<Question> qset;

    public long getId() {
        return id;
    }

    public Set<Question> getQuestions() {
        return this.qset;
    }

    public Set<Question> setQuestions(Set<Question> newqset) {
        this.qset = newqset;
        return this.qset;
    }

    public QuestionList(Set<Question> qset){
        this.qset = qset;
    }
}
