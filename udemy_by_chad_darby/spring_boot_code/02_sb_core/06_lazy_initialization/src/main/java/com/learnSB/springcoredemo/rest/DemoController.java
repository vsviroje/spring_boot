package com.learnSB.springcoredemo.rest;

import com.learnSB.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach obj) {
        System.out.println("In Constructor:" + getClass().getSimpleName());
        myCoach = obj;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }
}
