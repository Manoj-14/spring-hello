package com.project.springboot.rest;

import com.project.springboot.common.Couch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Couch myCouch;

    @Autowired
    public Controller(@Qualifier("cricketCouch") Couch couch){
        this.myCouch = couch;
    }

    @GetMapping("dailyWorkOut")
    public String dailyWorkOut(){
        return myCouch.getDailyWorkout();
    }


}
