package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyBean {
	@PostConstruct
	public void postConstruct() {
		System.out.println("This is post construct");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("This is pre destroy");
	}
	public void printHello() {
		System.out.println("Hello from MyBean");
	}
	
}
