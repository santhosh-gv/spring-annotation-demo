package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = {"arjun reddy", "taxiwaala"})
    public Movie getMovie()
    {
        return new Movie(setActor());
    }
    @Bean(name = "vd")
    public Actor setActor()
    {
        return new Actor("Vijay Devarakonda", "Male",29);
    }

}
