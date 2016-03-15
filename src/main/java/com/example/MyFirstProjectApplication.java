package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MyFirstProjectApplication {
	
	public static void main(String[] args) {
		
		//SpringApplication.run(MyFirstProjectApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(MyFirstProjectApplication.class);
		Book book1 = ctx.getBean(Book.class);
		System.out.println(book1);
	}
}
