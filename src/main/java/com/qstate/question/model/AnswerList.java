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

    public AnswerList(Set<Answer> answerSet){
        // constructor
        this.answerSet = answerSet;
    }

    public long getId() {
        return id;
    }

    public Set<Answer> setAnswerSet(Set<Answer> newAnswerSet) {
        this.answerSet = newAnswerSet;
        return this.answerSet;
    }

    public Set<Answer> getAnswerSet(){
        return this.answerSet;
    }


}
