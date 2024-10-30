package com.nt;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.DoctorServiceImpl;
import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootProj08Jpa1Application {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(BootProj08Jpa1Application.class, args);
		DoctorServiceImpl bean = ctx.getBean(DoctorServiceImpl.class);
		try {
			Doctor doctor = new Doctor();
			doctor.setDocName("Akash");
			doctor.setIncome(7890.00);
			doctor.setSpecialization("Eye Surgeon");
			
			String result = bean.registerDoctor(doctor);
			System.out.println(result);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
