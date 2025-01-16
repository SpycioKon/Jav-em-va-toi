package com.example.demo;

import org.springframework.stereotype.Component;

@Component("BaseballCouch")
public class BaseballCouch implements Couch {    

    public BaseballCouch(){
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