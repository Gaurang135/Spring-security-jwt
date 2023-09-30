package com.practice.demoMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMavenApplication.class, args);
		Person p = new Person("10","HEy");
		System.out.println(p.age());
	}
	@GetMapping("/")
	public String greet(){
		return "HELLO";
	}
	record Person(String age, String name){}
}
