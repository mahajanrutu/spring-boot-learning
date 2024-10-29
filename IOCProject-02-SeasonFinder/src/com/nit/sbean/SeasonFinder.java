package com.nit.sbean;
import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component("sf")


public class SeasonFinder {
     
	private LocalDate currentDate;
	
	public SeasonFinder() {
		
	}
	public String findingSeason(String user)
	{
		int month = currentDate.getMonthValue();
		
		switch (month)
		{
			case 11:
			case 12:
			case 1:
			case 2:
				return "Happy Winter:" +user;
			case 3:
			case 4:
			case 5:
			case 6:
				return "Happy Summer:" +user;
			case 7:
			case 8:
			case 9:
			case 10:
				return "Happy Rainy Season" +user;
				default:
					return "Unknown Season";
		}
	}
}
