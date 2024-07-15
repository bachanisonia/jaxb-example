package com.learnjava.springboot.model;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;

//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@XmlRootElement(name="book")
@XmlType( propOrder = {"id", "name", "date"} )
public class Book {

	private Long id;
	private String name;
	private String author;
	private Date date;
	
	public Book() {
	}
	
	public Book(Long id, String name, String author, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.date = date;
	}

	@XmlAttribute
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement(name="title")
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="date")
	public void setDate(Date date) {
		this.date = date;
	}
	
	@XmlTransient
	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Date getDate() {
		return date;
	}
	
	
	
}
