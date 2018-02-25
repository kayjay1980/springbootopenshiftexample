package com.jkr.example.microservice.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenShiftExampleApplication {

	public static void main(String[] args) {
		System.out.println("Starting 2...");
		SpringApplication.run(OpenShiftExampleApplication.class, args);
	}
}