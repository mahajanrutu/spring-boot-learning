package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Product;
import com.nt.service.IProductService;
@Controller
public class productController {

	@Autowired
	private IProductService productservice;
	
	Scanner sc = new Scanner(System.in);
	
	public void getProduct()
	{
		System.out.println("Enter Product Name: ");
		String productName = sc.nextLine();
		System.out.println("Enter Product Description: ");
		String description = sc.nextLine();
		System.out.println("Enter Product Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product();
		
		product.setProductName(productName);
		product.setDescription(description);
		product.setPrice(price);
		
		String result = productservice.add(product);
		System.out.println(result);
	}
	
	public void deleteProduct()
	{
		System.out.println("Enter Product Id to Delete from Data: ");
		int productId = sc.nextInt();
		
		
		String result = productservice.remove(productId);
		System.out.println(result);
	}
	
	public void retriveData()
	{
		List<Product> list = productservice.showData();
		list.forEach(System.out::println);
	}
	
	public void updateProduct()
	{
		System.out.println("Enter Product id Where you want changes: ");
		int productId = sc.nextInt();
		
		System.out.println("Enter New Product Name: ");
		String productName = sc.nextLine();
		productName = sc.nextLine();
		System.out.println("Enter Description of Product: ");
		String description = sc.nextLine();
		
		Product product = new Product();
		
		product.setProductId(productId);
		product.setProductName(productName);
		product.setDescription(description);
		
		String result = productservice.updateData(productName, description, productId);
		System.out.println(result);
	}
}
