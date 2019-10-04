package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "movie1")
    public Movie getMovie()
    {
        return new Movie();
    }
    @Bean(name = "actor1")
    public Actor setActor()
    {
        Actor actor = new Actor();
        actor.setName("Vijay Devarakonda");
        actor.setGender("Male");
        actor.setAge(29);
        return actor;

    }
}
