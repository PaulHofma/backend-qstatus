package com.qstate.question.service;

import org.springframework.beans.factory.annotation.Autowired;

public class QuestionListService {
    @Autowired          //only works on components or subclasses (?) thereof
    QuestionListRepository qr;


}
