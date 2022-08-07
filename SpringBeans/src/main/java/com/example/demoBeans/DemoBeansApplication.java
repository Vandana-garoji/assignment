package com.example.demoBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBeansApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicle");
		obj.carCheck();
	}

}
