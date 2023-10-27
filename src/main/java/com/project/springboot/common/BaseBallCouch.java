package com.project.springboot.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BaseBallCouch implements Couch{

    public BaseBallCouch(){
        System.out.println("in Constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "BaseBallCouch";
    }
}
