package com.learnjava.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learnjava.springboot.service.JaxbService;

@SpringBootApplication
public class JaxbExampleApplication implements CommandLineRunner {

	@Autowired
	private JaxbService service;
	
	public static void main(String[] args) {
		SpringApplication.run(JaxbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.marshal();
	}

}
