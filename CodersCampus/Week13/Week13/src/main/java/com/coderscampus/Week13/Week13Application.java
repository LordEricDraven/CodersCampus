package com.coderscampus.Week13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.coderscampus")
public class Week13Application {

	public static void main(String[] args) {
		SpringApplication.run(Week13Application.class, args);
	}

}
