package com.project.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCouch implements Couch{

    public TennisCouch(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "TennisCouch";
    }
}
