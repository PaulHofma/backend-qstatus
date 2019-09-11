package com.qstate.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class OpenAnswer {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
//    @JoinTable(name = "openanswers_of_openquestion")
    private OpenQuestion openQuestion;

    private String text;

    private AnswerList answerList;

    public long getId() {
        return id;
    }

    public OpenQuestion getOpenQuestion() {
        return openQuestion;
    }

    public void setOpenQuestion(OpenQuestion openQuestion) {
        this.openQuestion = openQuestion;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
