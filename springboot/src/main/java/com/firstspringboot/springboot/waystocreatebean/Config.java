package com.firstspringboot.springboot.waystocreatebean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Employee employee() {
		return new Employee(101,"Azhar Siddiqui");
	}
	@Bean
	public Student student(Address address) {
		return new Student(502,"Azhar Mujeeb",address);
	}
}
