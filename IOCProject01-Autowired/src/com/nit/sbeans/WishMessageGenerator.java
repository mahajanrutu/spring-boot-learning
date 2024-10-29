package com.nit.sbeans;
import java.time.LocalTime; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
     @Autowired
     
     private LocalTime it;
     
     public WishMessageGenerator() {
    	 System.out.println("WishMessageGenerator::0-Arg constructor");
     }
     
     public String generatorMessage(String user)
     {
    	 int hour=it.getHour();
    	 
    	 System.out.println("you reached at your destination at: "+hour);
    	 if(hour<12)
    		 return "Good Morning::"+user;
    	 else if(hour<16)
    		 return "Good Afternoon::"+user;
    	 else if(hour<20)
    		 return "Good Evening::"+user;
    	 else
    		 return "Good Night::"+user;
     }
}
