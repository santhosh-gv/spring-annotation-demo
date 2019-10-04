package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actor;

    public Movie() {
    }

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void displayActor()
    {
        System.out.println(actor.toString());
    }


}
