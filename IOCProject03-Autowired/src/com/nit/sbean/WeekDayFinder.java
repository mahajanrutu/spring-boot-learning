package com.nit.sbean;
import java.time.DayOfWeek; 
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("Wk")
@SuppressWarnings("unused")
public class WeekDayFinder {
   
	@Autowired
    private LocalDate weekDay;
    
    public WeekDayFinder()
    {
    	
    }
    
    public String findingWeek(String user)
    {
    	
    	DayOfWeek week = weekDay.getDayOfWeek();

		switch(week)
		{
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		}
		return user;
    }
}
