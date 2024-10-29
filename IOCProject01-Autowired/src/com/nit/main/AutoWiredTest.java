package com.nit.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class AutoWiredTest {
     public static void main(String[] args)
     {
    	 System.out.println("AutowiringTest.main()==start");
    	 
    	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	 
    	 System.out.println("AutowiringTest::IOC container creation crmpleted");
    	 
    	 WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
    	 System.out.println("Target spring bean class obj ref is gathered");
    	 
    	 String msg=generator.generatorMessage("Rutuja");
    	 
    	 System.out.println("result is::"+msg);
    	 
    	 ctx.close();
    	 
    	 System.out.println("AutowiringTest.main()==>End");
     }
}
