package com.firstspringboot.springboot.waystocreatebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
	@Value("101")//will override constructor values/
	private int sid;
	
//	@Value("Azhar")//will override constructor values
	private String name;
	
	private Address address;
	
	public Student() {
		System.out.println("IoC Container found the bean Student");
	}
	
	@Autowired
	public Student(int sid,String name,Address address) {
		this.sid = sid;
		this.name = name;
		this.address = address;
        System.out.println("IoC Container found the bean Student");
	}

   
	@PostConstruct
	public void init() {
		System.out.println("Studnet loaded");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Student brean is about to destroy");
	}
	public void getDetail()
	{
		System.out.println("sid = "+sid+" name = "+name+" address "+address.getAddress());
	}
}
