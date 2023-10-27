package com.project.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCouch implements Couch{
    @Override
    public String getDailyWorkout() {
        return "BaseBallCouch";
    }
}
