package com.entertainment.travelbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TravelBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelBuddyApplication.class, args);
	}

}
