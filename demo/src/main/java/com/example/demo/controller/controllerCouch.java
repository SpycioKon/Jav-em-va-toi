package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Couch;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class controllerCouch {

    private Couch mycouch;
    private Couch anothercouch;
    
    @Autowired
    public controllerCouch(@Qualifier("CricketCouch") Couch theCouch,
    @Qualifier("CricketCouch") Couch anotherCouch){
        mycouch = theCouch;
        anothercouch = anotherCouch;
    }

    @GetMapping("/mo")
    public String goodMorning() {
        return mycouch.goodMorning();
    }

    @GetMapping("/af")
    public String goodAfternoon() {
        return mycouch.goodAfternoon();
    }
    @GetMapping("/ev")
    public String goodEvening() {
        return mycouch.goodEvening();
    }

    @PreDestroy
    public void DoBeFor(){
        System.out.println("Starting...");
    }

    @PostConstruct
    public void DoCleanAfter(){
        System.out.println("Clear momories leck!!");
    }

    
}
