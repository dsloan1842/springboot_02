package com.example.springboot_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot02Application {

	public static void main(String[] args) {// main() is the entry point for the Springboot02Application
		SpringApplication.run(Springboot02Application.class, args);
	}
} /* access-modifier = public;  return-type = void (no return); static means method
 can only be accessed by the class itself , not by instance of the class */
