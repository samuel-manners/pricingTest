package com.avios.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Loads up Spring
@SpringBootApplication
public class SpringRewardsCalculator {

	public static void main(String[] args) {
		SpringApplication.run(SpringRewardsCalculator.class, args);
		System.out.println("Application has successfully started");
	}

}
