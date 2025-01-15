package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class CricketCouch implements Couch {

    @Override
    public String goodMorning(){
        return "Good morning";
    };

    @Override
    public String goodAfternoon(){
        return "Good afternoon";
    };
    
    @Override
    public String goodEvening(){
        return "Good evening";
    };
}
