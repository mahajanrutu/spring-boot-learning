package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.BusController;

@SpringBootApplication
public class BootProj05CrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj05CrudApplication.class, args);
		BusController bean = ctx.getBean(BusController.class);
		bean.addBus();
		//System.out.println(bean.showBus());
		bean.showBus();
	}

}
