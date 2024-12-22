package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.Controller.InventoryController;
 @SpringBootApplication
public class BootProj10Jpa3Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj10Jpa3Application.class, args);
		InventoryController bean = ctx.getBean(InventoryController.class);
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("Choose an Option:");
			System.out.println("1. Add new Product");
			System.out.println("2. Update Existing Product");
			System.out.println("3. Search product by ID");
			System.out.println("4. See All product");
			System.out.println("5. Delete product by ID");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				bean.getInsertProduct();
                break;
                
			case 2:
				bean.getUpdteProduct();
				break;
				
			case 3:
				bean.getproductById();
                break;
                
			case 4:
				bean.getAllProducts();
                break;
              
			case 5:
				bean.getProductDeleteById();
				break;
				
			case 6:
				System.out.println("Existing...");
				break;
			
			default:
				System.out.println("Invalid Choice");
                 break;
                 }
			System.out.println();
		}while(choice!=6);
		
		
	}
	

}
