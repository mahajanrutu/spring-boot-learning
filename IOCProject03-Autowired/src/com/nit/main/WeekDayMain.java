package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Config.*;
import com.nit.sbean.*;

public class WeekDayMain {
     
	public static void main (String[] args)
	{
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(WeekDayConfig.class);
		
		WeekDayFinder generator = ctx.getBean(WeekDayFinder.class);
		
		String msg = generator.findingWeek("Rushikesh");
		
		System.out.println(msg);
		
		ctx.close();
		
	}
}
