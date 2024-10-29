package com.nt.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("stu")
public class Student {
	@Value("Rutuja")
    private String name;
	@Value("10")
    private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {      
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
}
