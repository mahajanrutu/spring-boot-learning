package com.nit.Config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class WeekDayConfig {

	public WeekDayConfig() {
		
	}
	
	@Bean
	public LocalDate cresteDate() {
		return LocalDate.now();
	}
	
}
