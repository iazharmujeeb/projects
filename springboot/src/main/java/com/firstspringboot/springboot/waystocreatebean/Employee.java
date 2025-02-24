package com.firstspringboot.springboot.waystocreatebean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component//if we create bean using Configuration we neeed to remove @Component
public class Employee {
	
//	@Value("501")will override constructor values
	private int eid;
	
//	@Value("Mujeeb") will override constructor values
	private String name;
	
	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	
	public void getDetail()
	{
		System.out.println("eid "+eid+" ename "+name);
	}
}
