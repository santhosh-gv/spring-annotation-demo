package com.stackroute;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        //Task 2
        System.out.println("Using Annotations! - Constructor Injection");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = annotationConfigApplicationContext.getBean("arjun reddy",Movie.class);
        movie.displayActor();

        Movie movie2 = annotationConfigApplicationContext.getBean("taxiwaala",Movie.class);
        movie2.displayActor();
        System.out.println();
        System.out.println("Comparing two movies "+ (movie==movie2));

    }
}
