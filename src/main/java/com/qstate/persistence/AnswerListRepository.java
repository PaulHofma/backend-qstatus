package com.qstate.persistence;

import com.qstate.model.AnswerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AnswerListRepository extends CrudRepository<AnswerList, Long> {

    @Autowired
    List<AnswerList> findByTrainee_Id(long trainee_id);
}