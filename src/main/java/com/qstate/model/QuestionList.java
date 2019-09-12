package com.qstate.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class QuestionList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @JoinTable(name = "questions_in_questionlist",
            joinColumns = @JoinColumn(name = "questionlist_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id"))
    private List<Question> questionList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
