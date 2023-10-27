package com.project.springboot.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCouch implements Couch{
    @PostConstruct
    public void doSomeStartUpStuff(){
        System.out.println("Doing my starting stuffs.....");
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Couch";
    }

    @PreDestroy
    public void doSomeCleanUpStuff(){
        System.out.println("Doing my cleaning stuffs.....");
    }
}
