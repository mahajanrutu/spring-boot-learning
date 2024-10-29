package com.nit.model;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.nit.service.BookServiceStore;
@Component
@PropertySource("com/nit/commons/application.properties")
public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.id}")
	private int id;
	@Autowired
	private BookServiceStore book;

	public Student() {

	}

	public BookServiceStore getBook() {
		return book;
	}

	public void setBook(BookServiceStore book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
