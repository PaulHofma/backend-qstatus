package com.qstate.model;

import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class AnswerList {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
    private Trainee trainee;

    @OneToMany(mappedBy = "id")
    private List<Answer> answers;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Trainee getTrainee() {
        return trainee;
    }
    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public double calcIQ() {
        double score = 0;
        int counter = 0;
        for(Answer answer : this.answers){
            Question question = answer.getQuestion();
            if(question.getQuestionType() == QuestionType.CLOSED){
                ClosedQuestion closedQuestion = (ClosedQuestion)question;
                ClosedAnswer closedAnswer = (ClosedAnswer)answer;
                counter++;
                score += (closedQuestion.getIqWeight() * closedAnswer.getResponse()) / closedQuestion.getRange();
            }
        }
        if(counter == 0){
            return 0;
        }
        return score/counter;
    }
    public double calcEQ() {
        double score = 0;
        int counter = 0;
        for(Answer answer : this.answers){
            Question question = answer.getQuestion();
            if(question.getQuestionType() == QuestionType.CLOSED){
                ClosedQuestion closedQuestion = (ClosedQuestion)question;
                ClosedAnswer closedAnswer = (ClosedAnswer)answer;
                counter++;
                score += (closedQuestion.getEqWeight() * closedAnswer.getResponse()) / closedQuestion.getRange();
            }
        }
        if(counter == 0){
            return 0;
        }
        return score/counter;
    }
    public double calcSQ() {
        double score = 0;
        int counter = 0;
        for(Answer answer : this.answers){
            Question question = answer.getQuestion();
            if(question.getQuestionType() == QuestionType.CLOSED){
                ClosedQuestion closedQuestion = (ClosedQuestion)question;
                ClosedAnswer closedAnswer = (ClosedAnswer)answer;
                counter++;
                score += (closedQuestion.getSqWeight() * closedAnswer.getResponse()) / closedQuestion.getRange();
            }
        }
        if(counter == 0){
            return 0;
        }
        return score/counter;
    }
    public double calcFQ() {
        double score = 0;
        int counter = 0;
        for(Answer answer : this.answers){
            Question question = answer.getQuestion();
            if(question.getQuestionType() == QuestionType.CLOSED){
                ClosedQuestion closedQuestion = (ClosedQuestion)question;
                ClosedAnswer closedAnswer = (ClosedAnswer)answer;
                counter++;
                score += (closedQuestion.getFqWeight() * closedAnswer.getResponse()) / closedQuestion.getRange();
            }
        }
        if(counter == 0){
            return 0;
        }
        return score/counter;
    }
}
