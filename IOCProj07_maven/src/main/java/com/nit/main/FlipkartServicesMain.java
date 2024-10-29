package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.services.FlipkartService;

public class FlipkartServicesMain {

	public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       
       FlipkartService bean =ctx.getBean(FlipkartService.class);
       
       bean.deliveryService();
       
       ctx.close();
       
       
	}

}
