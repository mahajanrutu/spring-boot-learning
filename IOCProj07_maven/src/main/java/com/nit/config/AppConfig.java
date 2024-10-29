package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.nit.model", "com.nit.services"})
public class AppConfig {
    
}
