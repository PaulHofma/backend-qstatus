//package com.qstate.model;
//
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//public class AnswerList {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
////    @ManyToMany
////    @JoinTable(
////            name = "answers_in_answerlist",
////            joinColumns = @JoinColumn(name = "answerlist_id"),
////            inverseJoinColumns = @JoinColumn(name = "answer_id"))
////    private Set<OpenAnswer> openAnswerSet;
//
////    @ManyToOne
////    @JoinColumn(name="TRAINEE_ID")
////    private User trainee; //MAKE TRAINEE
//
//    public AnswerList(Set<OpenAnswer> openAnswerSet){
//        // constructor
//        this.openAnswerSet = openAnswerSet;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Set<OpenAnswer> setAnswerSet(Set<OpenAnswer> newOpenAnswerSet) {
//        this.openAnswerSet = newOpenAnswerSet;
//        return this.openAnswerSet;
//    }
//
//    public Set<OpenAnswer> getOpenAnswerSet(){
//        return this.openAnswerSet;
//    }
//
//    public User getTrainee() {
//        return trainee;
//    }
//
//    public void setTrainee(User trainee) {
//        this.trainee = trainee;
//    }
//
//    public double calcIQ() {
//        //ADD FUNCTIONALITY
//        return 0.0;
//    }
//
//    public double calcEQ() {
//        //ADD FUNCTIONALITY
//        return 0.0;
//    }
//
//    public double calcSQ() {
//        //ADD FUNCTIONALITY
//        return 0.0;
//    }
//
//    public double calcFQ() {
//        //ADD FUNCTIONALITY
//        return 0.0;
//    }
//
//    public double[] calcQArray(){
//        return new double[]{calcIQ(), calcEQ(), calcSQ(), calcFQ()};
//    }
//}
