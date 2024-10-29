package main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nit.config.AddConfig;
import com.nit.sbeans.MonthGenerator;



public class monthmain {
	  public static void main(String[] args)
	     {
	    	 System.out.println("AutowiringTest.main()==start");
	    	 
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AddConfig.class);
	    	 
	    	 System.out.println("AutowiringTest::IOC container creation crmpleted");
	    	 
	    	 MonthGenerator generator=ctx.getBean("sf",MonthGenerator.class);
	    	 System.out.println("Target spring bean class obj ref is gathered");
	    	 
	    	 String msg=generator.findingSeason("Rutuja");
	    	 
	    	 System.out.println("result is::"+msg);
	    	 
	    	 ctx.close();
	    	 
	    	 System.out.println("AutowiringTest.main()==>End");
	     }
}
