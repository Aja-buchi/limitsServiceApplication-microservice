package com.bujujanton.microservices.limitsservice.controller;

import com.bujujanton.microservices.limitsservice.configuration.Configuration;
import com.bujujanton.microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LimitsServiceController {
    @Autowired
    private Configuration configuration;

    public LimitsServiceController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//    return new Limits(1,1000);
    }
}
