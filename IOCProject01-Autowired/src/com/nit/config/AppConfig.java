package com.nit.config;
import java.time.LocalTime; 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {
     
	public AppConfig()
	{
		System.out.println("AppConfig.O-arg constructor");
	}
	@Bean(name="ltime")
	public LocalTime creatLTime() {
		System.out.println("AppConfig.createLTime()");
		return LocalTime.now();
	}
}
