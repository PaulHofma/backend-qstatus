package com.qstate.question.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Trainee extends User {
    @ManyToOne
    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
