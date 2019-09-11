package com.qstate.question.service;

import com.qstate.question.exceptions.TipIdUnknownException;
import com.qstate.question.model.Tip;
import com.qstate.question.persistence.TipRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipService {
  @Autowired
  TipRepository tr;

  public Iterable<Tip> getTips() {
    return tr.findAll();
  }

  public Tip saveTip(Tip tip){
    return tr.save(tip);
  }

  public Tip getTip(long tipId) throws TipIdUnknownException {
    Optional<Tip> tip = tr.findById(tipId);
    if (tip.isPresent()) {
      return tip.get();
    } else {
      throw new TipIdUnknownException();
    }
  }
}
