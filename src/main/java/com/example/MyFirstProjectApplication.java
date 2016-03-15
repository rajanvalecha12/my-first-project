package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MyFirstProjectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(MyFirstProjectApplication.class,args);
		Book book1 = ctx.getBean(Book.class);
		/*Author auth1 = ctx.getBean(Author.class);

		auth1.setAuthorName("Yashwant Kanetkar");
		auth1.setAddress("Delhi");
		book1.setBookName("Let Us C");
		book1.setBookNumber(101L);
		book1.setPrice(350.00);
		book1.setAuthor(auth1);*/
		System.out.println(book1);
	}
}
