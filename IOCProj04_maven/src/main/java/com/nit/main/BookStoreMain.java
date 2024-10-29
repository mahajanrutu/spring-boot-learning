package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.model.Student;
import com.nit.service.BookServiceStore;

public class BookStoreMain {

	public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       
       Student bean2 = ctx.getBean(Student.class);
       System.out.println(bean2);
       BookServiceStore bean = ctx.getBean(BookServiceStore.class);
       
       bean.storeService();
       
       ctx.close();
	}

}
