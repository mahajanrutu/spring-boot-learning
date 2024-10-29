package com.nit.model;

import org.springframework.stereotype.Component;

@Component("sci")
public class Science implements ISubject {

	@Override
	public void read() { 
      System.out.println("Science.read()");
	}

	@Override
	public void write() {
      System.out.println("Science.write()");
	}

}
