package com.nit.model;

import org.springframework.stereotype.Component;

@Component("SciStudent")
public class ScienceStudent implements ISubject {

	@Override
	public void start() {
		// TODO Auto-generated method stub
	       System.out.println("He is studying Science now...");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	       System.out.println("He stopped studying Science...");

	}

}
