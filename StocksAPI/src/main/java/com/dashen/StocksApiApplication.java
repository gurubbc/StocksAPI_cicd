package com.dashen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StocksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksApiApplication.class, args);
		System.out.println("Stocks API started...");
	}

}
