package com.example.aop;

import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot20212Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot20212Application.class, args);
		System.out.println(Base64.getEncoder().encodeToString("slalom0914@gmail.com".getBytes()));
	}

}
