package com.nit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("math")
@PropertySource("com/nit/commons/application.properties")
public class Maths implements ISubject {

	@Value("${student.name}")
	private String name;
	@Override
	public void read() {
       System.out.println(name +"Maths.read()");
	}

	@Override
	public void write() {
       System.out.println("Maths.write()");
	}

}
