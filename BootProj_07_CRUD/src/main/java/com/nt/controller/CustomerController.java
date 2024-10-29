package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Customer;
import com.nt.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService customerService;

	Scanner sc = new Scanner(System.in);

	public void getALlData() {
		System.out.println("Enter Customer Name: ");
		String customerName = sc.nextLine();

		System.out.println("Enter Customer Email Id: ");
		String emailId = sc.nextLine();

		System.out.println("Enter Customer Phone Number: ");
		long phone = sc.nextLong();

		Customer customer = new Customer();

		customer.setCustomerName(customerName);
		customer.setEmailId(emailId);
		customer.setPhoneNo(phone);

		String result = customerService.addData(customer);
		System.out.println(result);

	}
    
	public void deleteData()
	{
		System.out.println("Enter a ID to delete the data:");
		int customerID = sc.nextInt();
		
		String result = customerService.deleteData(customerID);
		System.out.println(result);
	}
	
	public void updateData()
	{
		System.out.println("Enter ID to change phone number: ");
		int customerId = sc.nextInt();
		
		System.out.println("Enter new phone Number to update: ");
		long phoneNo = sc.nextLong();
		
		String result = customerService.updateData(phoneNo, customerId);
		System.out.println(result);
	}
	
	public void showData()
	{
		List<Customer> list = customerService.showData();
		list.forEach(System.out::println);
	}
	
	public void showEmail()
	{
		System.out.println("Enter Email to search Customer Details: ");
		String emailId = sc.nextLine();
		
		Customer customer = customerService.showByEmail(emailId);
		System.out.println(customer);
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
