package com.qstate.service;

import com.qstate.exceptions.AnswerListIdUnknownException;
import com.qstate.exceptions.UserIdUnknownException;
import com.qstate.model.AnswerList;
import com.qstate.persistence.AnswerListRepository;
import com.qstate.persistence.AnswerRepository;
import com.qstate.persistence.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerListService {
    @Autowired
    AnswerListRepository alr;

    @Autowired
    AnswerRepository ar;

    @Autowired
    TraineeRepository tr;

    public AnswerList getAnswerList(long id) throws AnswerListIdUnknownException {
        Optional<AnswerList> foundAnswerList = alr.findById(id);
        if (foundAnswerList.isPresent()) {
            return foundAnswerList.get();
        } else {
            throw new AnswerListIdUnknownException();
        }
    }

    public List<AnswerList> getMostRecentAnswerList(long trainee_id) throws UserIdUnknownException {
        return alr.findByTrainee_Id(trainee_id);
    }

    public Iterable<AnswerList> getAllAnswerLists() {
        return alr.findAll();
    }

    public AnswerList saveAnswerList(AnswerList answerList) {
        return alr.save(answerList);
    }

    public AnswerList deleteAnswerList(long answerId) throws AnswerListIdUnknownException {
        Optional<AnswerList> a = alr.findById(answerId);
        if(a.isPresent()){
            AnswerList answerList_to_delete = a.get();
            alr.delete(answerList_to_delete);
            return answerList_to_delete;
        } else {
            throw new AnswerListIdUnknownException();
        }
    }
}
