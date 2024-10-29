package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.nit.model", "com.nit.service"})
@PropertySource("com/nit/commons/application.properties")
public class AppConfig {

}
