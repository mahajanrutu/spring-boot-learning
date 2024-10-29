package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.CustomerController;

@SpringBootApplication
public class BootProj07CrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj07CrudApplication.class, args);
		CustomerController bean = ctx.getBean(CustomerController.class);
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Choose an option");
			System.out.println("1. Insert Customer Data");
			System.out.println("2. Delete Customer Data");
			System.out.println("3. Update Customer Data");
			System.out.println("4. Search Customer By Email");
			System.out.println("5. Retrive All Customer Data");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				bean.getALlData();
				break;
				
			case 2:bean.deleteData();
			break;
			
			case 3: bean.updateData();
			break;
			
			case 4: bean.showEmail();
			break;
			
			case 5: bean.showData();
			break;
			
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println();
		}while(choice !=6);
		
	}

}
