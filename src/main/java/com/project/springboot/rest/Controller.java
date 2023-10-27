package com.project.springboot.rest;

import com.project.springboot.common.Couch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Couch myCouch;
    private Couch anotherCouch;

    @Autowired
    public Controller(@Qualifier("cricketCouch") Couch couch,@Qualifier("cricketCouch") Couch anotherCouch){

        System.out.println("In Constructor"+ getClass().getSimpleName());

        this.myCouch = couch;
        this.anotherCouch = anotherCouch;
    }

    @GetMapping("dailyWorkOut")
    public String dailyWorkOut(){
        return myCouch.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans myCouch==anotherCouch "+ (myCouch==anotherCouch);
    }


}
