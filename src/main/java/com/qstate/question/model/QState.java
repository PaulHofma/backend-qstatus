package com.qstate.question.model;

import javax.persistence.*;

@Entity
public class QState {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne
    @JoinColumn(name="TRAINEE_ID")
    User trainee; //MAKE TRAINEE

    @OneToOne
    long answerlistid;
    double iqstate;
    double eqstate;
    double sqstate;
    double fqstate;
}
