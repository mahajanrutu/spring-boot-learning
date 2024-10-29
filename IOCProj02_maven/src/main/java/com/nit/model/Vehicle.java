package com.nit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	 @Autowired
	 @Qualifier("dEngine")
     private IEngine engine;

     public Vehicle()
     {
    	 
     }
	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
     
     public void getDetails()
     {
    	 engine.start();
    	 engine.stop();
     }
}
