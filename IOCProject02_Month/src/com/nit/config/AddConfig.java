package com.nit.config;
import java.time.LocalDate; 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.nit.sbeans")

public class AddConfig {
	public AddConfig()
	{
		System.out.println("AppConfig.O-arg constructor");
	}
	@Bean(name="ltime")
	public LocalDate creatLTime() {
		return LocalDate.now();
	}

}
