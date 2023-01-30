package com.in28minutes.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    /*
    The configuration values that we want to store is maximum and minimum. So these are the values that we would want to pick from the configuration.
    We need to actually add an annotation over the class to make sure that below values from here are mapped over to application.properties.

    The way it happens is through an annotation @ConfigurationProperties and the argument we need to add in here is the name of class i.e. limits-service is the name we added in application.properties.
    So you can have multiple configuration classes. The current one is this with name limits-service. So limits-service.minimum would be mapped to minimum and limits-service.maximum will be mapped to maximum.

    So the configuration value of limits-service from application.properties would be mapped to this specific Configuration class instance. And now we pick up the values in the LimitsController by adding an attrib of Configuration class and autowiring it.
     */
    private int minimum;
    private int maximum;

    public int getMinimum() {
        System.out.println("fetching minimum values");
        return minimum;
    }

    public void setMinimum(int minimum) {
        System.out.println("Setting minimum values");
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}