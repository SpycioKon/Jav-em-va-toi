package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class controllerCouch {

    private Couch mycouch;

    @Autowired
    public controllerCouch(@Qualifier("BaseballCouch") Couch thecouch){
         mycouch = thecouch;
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
    
}
