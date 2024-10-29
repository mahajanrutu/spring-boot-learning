package com.nt.model;

import org.springframework.stereotype.Component;

@Component("pengine")
public class PetrolEngine implements IEngine {
    
	@Override
	public void start() {
		// TODO Auto-generated method stub
      System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
      System.out.println("PetrolEngine.stop()");
	}

}
