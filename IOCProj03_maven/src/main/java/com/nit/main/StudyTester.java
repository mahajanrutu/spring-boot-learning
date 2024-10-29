package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.model.Student;

public class StudyTester {

	public static void main(String[] args)
	{
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Student bean =ctx.getBean(Student.class);
        
        bean.getDetails();
        
        ctx.close();
	}

}
