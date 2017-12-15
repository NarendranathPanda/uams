package com.uams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j;

@SpringBootApplication
@Log4j

public class Application {

	public Application() {
		log.info("University Assignment Management System");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}