package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext; 

import com.nit.config.SeasonConfig;
import com.nit.sbean.SeasonFinder;

public class SeasonMain {

	public static void main(String[] args)
	{
		//create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SeasonConfig.class);
		
		SeasonFinder generator = ctx.getBean("sf", SeasonFinder.class);
		
		String msg = generator.findingSeason("Rutuja"); 
		System.out.println(msg);
		
		ctx.close();
	}
}
