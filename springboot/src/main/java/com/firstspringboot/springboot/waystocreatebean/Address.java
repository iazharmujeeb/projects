package com.firstspringboot.springboot.waystocreatebean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Address {
	
	@Value("Lucknow")
	String city; 	
	
	public Address() {
		System.out.println("IoC Container Found the bean");
	}
	
	public String getAddress() {
		return this.city;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Address Loaded");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Address brean is about to destroy");
	}

}
