package de.berndclaasen.calenderapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    	System.out.println("Start");
        SpringApplication.run(Application.class, args);
    }
}