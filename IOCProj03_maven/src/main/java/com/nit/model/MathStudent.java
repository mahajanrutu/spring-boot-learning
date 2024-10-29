package com.nit.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("MathStudent")
public class MathStudent implements ISubject {

	@Override
	public void start() {
		// TODO Auto-generated method stub
       System.out.println("He is studying Maths now...");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
      System.out.println("He Stopped studyning Maths...");
	}

}
