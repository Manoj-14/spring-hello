package com.project.springboot.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCouch implements Couch{

    @Override
    public String getDailyWorkout() {
        return "Cricket Couch";
    }
}
