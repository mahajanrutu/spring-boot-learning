package com.nt.model;

import org.springframework.stereotype.Component;

@Component("dengine")
public class DieselEngine implements IEngine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
      System.out.println("DieselEngine.start()");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
      System.out.println("DieselEngine.stop()");
	}

}
