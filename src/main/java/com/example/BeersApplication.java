package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class BeersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeersApplication.class, args);
	}
}
