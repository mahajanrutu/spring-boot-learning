 package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Vehicle {
	@Autowired
	@Qualifier("pengine")
	private IEngine engine;
	@Value("BMW")
	private String name;
    
	public void journey(String pickup, String drop)
	{
		engine.start();
		System.out.println("Journey started from "+pickup);
		engine.stop();
		System.out.println("You are at your Destination...." +drop);
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	
}
