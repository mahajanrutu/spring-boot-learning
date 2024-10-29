package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.DiscountServices;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
               DiscountServices services = ctx.getBean(DiscountServices.class);
               double finalPrice = services.calculateFinalPrice(2000);
               System.out.println(finalPrice);
               
              
    }
}
