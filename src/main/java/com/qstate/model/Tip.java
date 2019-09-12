package com.qstate.model;

import javax.persistence.*;

@Entity
public class Tip {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private QType qType;
  private double qLevel;
  private String text;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public QType getqType() {
    return qType;
  }

  public void setqType(QType qType) {
    this.qType = qType;
  }

  public double getqLevel() {
    return qLevel;
  }

  public void setqLevel(double qLevel) {
    this.qLevel = qLevel;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
