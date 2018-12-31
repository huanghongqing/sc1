package com.tdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sc1Application.class, args);
	}

}

