package com.project.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCouch implements Couch{

    @Override
    public String getDailyWorkout() {
        return "Cricket Couch";
    }
}
