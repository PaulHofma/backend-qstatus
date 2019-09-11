//package com.qstate.question.rest;
//
//import com.qstate.question.model.QuestionList;
//import com.qstate.question.persistence.QuestionListRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TESTINGENDPOINT {
//    @Autowired          //only works on components or subclasses (?) thereof
//    QuestionListRepository qlr;
//
//    @GetMapping("answerlisttest")
//    public QuestionList testEndpoint(){
//        QuestionList ql = new QuestionList();
//        qlr.save(ql);
//        System.out.println("hoi");
//        return ql;
//    }
//
//}