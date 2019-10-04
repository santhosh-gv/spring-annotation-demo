package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Scope("prototype")
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
