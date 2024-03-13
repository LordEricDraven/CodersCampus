package com.coderscampus.Week13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderscampus.Week13.Domain.User;
import com.coderscampus.Week13.service.FileService;

@Configuration
@Profile("dev")
public class Week13DevConfiguration {

	// For illustration purposes only as an example of a real 
	// world type scenario of connecting to a database
//	@Bean
//	public Datasource datasource () {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://aslkdfj.;aklsjdf.com:360");
//		db.setUsername("dev01dbblahblah");
//		
//		return db;
//	}
	
	@Bean
	public FileService fileService () {
		return new FileService("Test.txt");
	}
	
	@Bean
	public User superUser() {
		return new User("trevor@craftycodr.com", "abc123", "Trevor Page");
	}
	
	@Bean
	public User regularUser() {
		return new User("regular_joe@gmail.com", "joe123", "Joe Blow");
	}
}
