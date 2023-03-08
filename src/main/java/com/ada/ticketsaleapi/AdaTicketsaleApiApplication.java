package com.ada.ticketsaleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AdaTicketsaleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdaTicketsaleApiApplication.class, args);
	}

}
