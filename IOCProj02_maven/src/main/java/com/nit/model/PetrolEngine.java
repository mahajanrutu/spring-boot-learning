package com.nit.model;

import org.springframework.context.annotation.Primary; 
import org.springframework.stereotype.Component;

@Component("pEngine")
@Primary
public class PetrolEngine implements IEngine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
       System.out.println("Auto Start From Petrol Engine");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
    System.out.println("Auto Stop from Pertrol Engine");
	}

}
