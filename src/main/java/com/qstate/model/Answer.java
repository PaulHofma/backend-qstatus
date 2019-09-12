package com.qstate.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Answer {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
//    @JoinTable(name = "answers_of_question")
    private Question question;

    @ManyToOne
//    @JoinTable(name="answers_in_answerlist")
    private AnswerList answerList;

    private String text;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AnswerList getAnswerList() {
        return answerList;
    }

    public void setAnswerList(AnswerList answerList) {
        this.answerList = answerList;
    }
}
