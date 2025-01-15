package com.example.demo;
import org.springframework.stereotype.Component;

@Component("CricketCouch")
public class CricketCouch implements Couch {

    public CricketCouch(){
        System.out.println(" "+getClass().getSimpleName());
    }
    
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
