package com.qstate.persistence;

import com.qstate.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AnswerRepository extends CrudRepository<Answer, Long> {
    @Autowired
    List<Answer> findByAnswerList_Id(long answerlist_id);
}
