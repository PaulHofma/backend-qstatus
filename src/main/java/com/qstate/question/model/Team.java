package com.qstate.question.model;

import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamnaam;

    @ManyToOne
    @JoinTable(name = "teams_of_manager")
    private Manager manager;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamnaam() {
        return teamnaam;
    }

    public void setTeamnaam(String teamnaam) {
        this.teamnaam = teamnaam;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
