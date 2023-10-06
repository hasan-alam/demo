package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
/*
 * @Configuration
 * 
 * @ComponentScan(basePackages = "com.example")
 */
public class MyspringApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyspringApplication.class, args);
		//myBean.printHello();
	}

}
