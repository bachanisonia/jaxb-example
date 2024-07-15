package com.learnjava.springboot.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnjava.springboot.model.Book;

@Configuration
public class JaxbConfig {

	@Bean(name="book1")
	Book RegisterBook() {
		
		return new Book(1L, "Book 1", "Author 1", new Date());
	}
	
}
