package com.firstspringboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firstspringboot.springboot.waystocreatebean.Employee;
import com.firstspringboot.springboot.waystocreatebean.Student;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cont = SpringApplication.run(SpringbootApplication.class, args);
	Student student = cont.getBean("student",Student.class);
	student.getDetail();
	Employee emp = cont.getBean("employee",Employee.class);
	emp.getDetail();
	cont.close();
	}
}
