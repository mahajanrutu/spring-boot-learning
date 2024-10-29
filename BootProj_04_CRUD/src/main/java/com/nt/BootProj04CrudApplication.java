package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.BookOpController;

@SpringBootApplication
public class BootProj04CrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj04CrudApplication.class, args);
		BookOpController bean = ctx.getBean(BookOpController.class);
		bean.addBook();
		System.out.println(bean.showBook());
	}

}
