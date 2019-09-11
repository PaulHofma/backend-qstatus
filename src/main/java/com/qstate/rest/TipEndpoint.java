package com.qstate.question.rest;

import com.qstate.question.exceptions.TipIdUnknownException;
import com.qstate.question.model.Tip;
import com.qstate.question.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipEndpoint {

  @Autowired
  TipService ts;

  @GetMapping(value="/tip")
  public Iterable<Tip> getTips() {
    return ts.getTips();
  }

  @PostMapping(value="tip")
  public Tip makeQuestion(@RequestBody Tip tip){
    return ts.saveTip(tip);
  }

  @GetMapping(value="/tip/{id}")
  public Tip getTip(@PathVariable(name="id") long tipId) {
    try {
      return ts.getTip(tipId);
    } catch (TipIdUnknownException e) {
      return null;
    }
  }
}
