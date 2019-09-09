package com.qstate.question.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



//saved to database!
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
}
