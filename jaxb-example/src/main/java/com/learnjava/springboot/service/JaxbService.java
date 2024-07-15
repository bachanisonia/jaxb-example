package com.learnjava.springboot.service;

import java.io.File;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.learnjava.springboot.model.Book;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

@Service
@Slf4j
public class JaxbService {
	
	@Autowired
	@Qualifier("book1")
	private Book book1;

	
	public void marshal()  {
	
//		JAXBContext jaxbContext = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[]{Book.class}, null);
		
		JAXBContext context;
		try {
			
			context = JAXBContext.newInstance(Book.class);
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			mar.marshal(book1, new File("./book.xml") );
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
}
