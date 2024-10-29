package com.nit.config;

import java.time.LocalDate; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")

public class SeasonConfig {
	public SeasonConfig() {

	}

	@Bean
	public LocalDate createDate() {
		return LocalDate.now();
	}
}
