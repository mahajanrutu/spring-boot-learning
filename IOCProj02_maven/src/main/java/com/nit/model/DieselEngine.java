package com.nit.model;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
       System.out.println("Auto Start from Diesel Engine");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
        System.out.println("Auto Stop from Diesel Engine");
	}

}
