package com.nit.sbeans;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component("sf")
public class MonthGenerator {
 private LocalDate it;
     
     public MonthGenerator() {
     }
     
     public String findingSeason(String user)
     {
    	 int month = it.getMonthValue();
    	 
    	 switch(month) {
    	 case 11:
    		 case 12:
    		 case 1:
    		 case 2:
    			 return "Happy Winter" +user;
    		 case 3:
    		 case 4:
    		 case 5:
    		 case 6:
    			 return "Happy Summer" +user;
    		 case 7:
    		 case 8:
    		 case 9:
    		 case 10:
    			 return "Happy Rainy season"+user;
    			 default:
    				 return "Unkonwn Season";
    	 }
     }
}

