package com.project.springboot.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCouch implements Couch{

    @Override
    public String getDailyWorkout() {
        return "Cricket Couch";
    }
}
