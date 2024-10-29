package com.nit.model;

import org.springframework.stereotype.Component;

@Component("HinStudent")
public class HindiStudent implements ISubject {

	@Override
	public void start() {
		// TODO Auto-generated method stub
	       System.out.println("He is studying Hindi now...");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	       System.out.println("He stopped studying Hindi...");

	}

}
