package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
We'll create a microservice which is called Limits Service then we'll set up a Spring Cloud Config Server which would be connected to a git repository.

Following dependencies, we've added while creating this limits-service project:-

We want to create a rest API, so we would choose Spring Web. It is used to build web, including restful applications using Spring MVC.
We would get Tomcat as the default embedded container.

Spring Boot DevTools - DevTools provides us with fast application restarts and live reload.

Added actuator as well i.e. Spring boot Actuator, it provides endpoints that help you to monitor and manage your application.

Last one which we've added is Config Client. We would want the limit service to connect to Spring Cloud Config Server and that's why we are adding in Config Client dependency.


One of the important recommendations is not to have any spaces in your folder path. Having spaces in your folder path can cause problems for your microservices,
especially if you're making use of spring cloud conflict server. So make sure that you do not have any spaces in your folder paths that you use for this project,
as well as for the other projects that we would subsequently create.


Before we go any further, there is one simple configuration that we would need to make in our application.properties.
Whenever you're making use of spring-cloud-starter-config i.e. when we add in spring-cloud-starter-config dependency in pom.xml, we would need to configure
how spring-cloud-starter-config needs to connect to Spring Cloud Config Server. So we need to configure spring.config.import and here we need to configure
where we want to import it from. We would want to import it from Config Server, and we'll also configure the URL.
Typically, we would be running Config Server on port 8888. So we configure spring.config.import = configserver:http://localhost:8888
where the Config Server would be running. But right now, we don't have the Config Server running and that's the reason why we would say this is optional for now.

So we would say like - spring.config.import=optional:configserver:http://localhost:8888.

Once the Config Server is available at a later step, you would see that the limit service would automatically talk to the Config Server.

So the configuration we are making, saying that this is the Config Server. However, the Config Server connection is optional.
With earlier versions of Spring Boot this configuration was not really needed until the time we had the Config Server already, but with the latest versions of
Spring Boot the applications do not even start up if you have spring-cloud-starter-config in your dependencies, and you don't have configuration like this.
Let's see how to run this application in the next step.
 */
@SpringBootApplication
public class LimitsServiceApplication
{
	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}
}