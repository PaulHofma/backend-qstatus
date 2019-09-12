package com.qstate.persistence;

import com.qstate.model.Tip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TipRepository extends CrudRepository<Tip, Long> {

}
