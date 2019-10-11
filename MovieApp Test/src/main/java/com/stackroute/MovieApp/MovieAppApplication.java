package com.stackroute.MovieApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
@EnableEurekaClient
public class MovieAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieAppApplication.class, args);
//		MovieAppStartup startup=new MovieAppStartup();
//		startup.onApplicationEvent();
	}

}
