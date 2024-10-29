package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.bean.Student;

@SpringBootApplication
public class BootProj02Application {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(BootProj02Application.class, args);
	Student bean = ctx.getBean("stu",Student.class);
	System.out.println(bean);
	}

}
