package com.in28minutes.springboot.tutorial.basics.example.springboottutorialbasics.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.springboot.tutorial.basics.example.springboottutorialbasics.dao.Dao1;
import com.in28minutes.springboot.tutorial.basics.example.springboottutorialbasics.feature.TrackTime;

@Service

public class Business1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired

    private Dao1 dao1;

    @TrackTime
    public String calculateSomething() {

        String value = dao1.retrieveSomething();

        logger.info("In Business - {}", value);

        return value;

    }

}