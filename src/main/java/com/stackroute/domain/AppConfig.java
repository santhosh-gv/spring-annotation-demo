package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "movie1")
    public Movie getMovie()
    {
        return new Movie(setActor());
    }
    @Bean(name = "actor1")
    public Actor setActor()
    {
        return new Actor("Vijay Devarakonda", "Male",29);

    }
}
