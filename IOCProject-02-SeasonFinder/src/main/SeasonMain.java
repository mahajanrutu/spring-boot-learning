package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbean.SeasonFinder;

import seasonConfig.ConfigSeason;

public class SeasonMain {
       public static void main(String[] args)
       {
    	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigSeason.class);
    	   
    	   SeasonFinder generator = ctx.getBean("sf", SeasonFinder.class);
    	   
    	   String msg = generator.findingSeason("Rutuja");
    	   
    	   System.out.println(msg);
    	   
    	   ctx.close();
       }
}
