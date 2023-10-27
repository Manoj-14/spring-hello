package com.project.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCouch implements Couch{

    public TrackCouch(){
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "TrackCouch";
    }
}
