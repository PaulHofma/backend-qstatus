package com.qstate.question.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vraag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String vraagtext;
    int aantalAntwoordenGoed;
}
