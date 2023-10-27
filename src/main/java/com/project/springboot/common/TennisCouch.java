package com.project.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCouch implements Couch{
    @Override
    public String getDailyWorkout() {
        return "TennisCouch";
    }
}
