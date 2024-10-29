package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.model.Vehicle;

/**
 * Hello world!
 *
 */
public class VehicleTester 
{
    public static void main( String[] args )
    {
         AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
         
         Vehicle bean = ctx.getBean(Vehicle.class);
         
         bean.getDetails();
         
         ctx.close();
    }
}
