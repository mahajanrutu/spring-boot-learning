package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.productController;

@SpringBootApplication
public class BootProj06CrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj06CrudApplication.class, args);
		productController bean = ctx.getBean(productController.class);
		//bean.getProduct();
		bean.retriveData();
		//bean.deleteProduct();
		bean.updateProduct();
		bean.retriveData();

	}

}
