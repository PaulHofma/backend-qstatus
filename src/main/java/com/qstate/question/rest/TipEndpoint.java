package com.qstate.question.rest;

import com.qstate.question.model.Tip;
import com.qstate.question.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipEndpoint {

  @Autowired
  TipService ts;

  @GetMapping(value="/tip")
  public Iterable<Tip> getTips() {
    return ts.getTips();
  }
}
