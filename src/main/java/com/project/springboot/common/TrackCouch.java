package com.project.springboot.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCouch implements Couch{
    @Override
    public String getDailyWorkout() {
        return "TrackCouch";
    }
}
