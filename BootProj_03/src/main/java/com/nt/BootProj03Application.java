package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.model.Vehicle;

@SpringBootApplication
public class BootProj03Application {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootProj03Application.class, args);
	Vehicle bean = ctx.getBean(Vehicle.class);
	bean.journey("Hyderabad", "Nagpur");
	System.out.println(bean.toString());
	}

}
