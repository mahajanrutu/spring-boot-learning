package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Config.AppConfig;
import com.nit.service.FlipkartService;

public class FlipkartServiceMain {

	public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       
       FlipkartService bean =ctx.getBean(FlipkartService.class);
       
       bean.deliveryService();
       
       ctx.close();
       
       
	}

}
