package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Let's create a simple REST API in here. We'll start off with creating a hard coded rest API, returning hard coded data,
and then we would enhance it to pick it up from configuration and after that we would connect it to the centralized configuration.
 */
@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        // return new Limits(1, 1000); //  So we have a simple Limits service running with this. Next, we'll actually make it use application configuration then we would actually connect it to centralized configuration.
        /*
        Let's see how to get min & max values from configuration. So in application.properties, we would want to configure a few properties - limits-service.minimum and limits-service.maximum
        And instead of returning the hardcoded limits, you'd want to first pick up the values from application.properties and return them back in this specific controller.
        Spring boot makes it really easy to actually pick up values from application.properties.

        All that you need to do is to create a simple class. So we've created a class named Configuration which matches the structure which we have in application.properties.
        Limit service is the name of the microservice and the minimum maximum are the configuration values which we are storing in here.
         */
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        // Now I'm picking up the values from application.properties. In the subsequent steps, we would connect our limits-service to a centralized configuration server.
    }
}