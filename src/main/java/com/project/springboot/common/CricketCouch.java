package com.project.springboot.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCouch implements Couch{

    public CricketCouch(){
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Cricket Couch";
    }
}
