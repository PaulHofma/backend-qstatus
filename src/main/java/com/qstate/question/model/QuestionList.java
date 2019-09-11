package com.qstate.question.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class QuestionList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @JoinTable(name = "questions_in_questionlist")
//            joinColumns = @JoinColumn(name = "questionlist_id"),
//            inverseJoinColumns = @JoinColumn(name = "question_id"))
    private Set<Question> questionSet;

    public long getId() {
        return id;
    }

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Question> questionSet) {
        this.questionSet = questionSet;
    }
}
