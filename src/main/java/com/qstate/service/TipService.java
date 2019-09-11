package com.qstate.question.service;

import com.qstate.question.model.Tip;
import com.qstate.question.persistence.TipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipService {
  @Autowired
  TipRepository tr;

  public Iterable<Tip> getTips() {
    return tr.findAll();
  }
}
