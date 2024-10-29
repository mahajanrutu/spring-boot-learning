package com.nit.model;

import org.springframework.stereotype.Component;

@Component("EngStudent")
public class EnglishStudent implements ISubject {

	@Override
	public void start() {
		// TODO Auto-generated method stub
	       System.out.println("He is studying English now...");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	       System.out.println("He stopped studying English...");

	}

}
