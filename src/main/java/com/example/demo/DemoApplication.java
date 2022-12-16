package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/hello")
	String sayHello() {
		int a=10;
		int b=0;
		int c=a/b;
// 		System.out.println("Anmol");
		return "Hello Capgemini";
	}
	
// 	@RequestMapping("/error")
// 	String sayException() {
// 		int a=10;
// 		int b=0;
// 		int c=a/b;
// 		System.out.println("Exception");
// 		return "Hello Capgemini";
// 	}
}
