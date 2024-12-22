package com.nt.Controller;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.InventoryManagement;
import com.nt.service.InventoryService;

@Controller
public class InventoryController {
      
	@Autowired
	private InventoryService inventoryService;
	
	Scanner sc = new Scanner(System.in);
	
	public void getInsertProduct()
	{
		System.out.println("Enter Product Name: ");
		String productName = sc.nextLine();
		
		System.out.println("Enter Product Description: ");
		String description = sc.nextLine();
		
		System.out.println("Enter Avaibility of product: ");
		int product_availability = sc.nextInt();
		
		System.out.println("Enter Product Price: ");
		double price = sc.nextDouble();
		
		InventoryManagement i2 = new InventoryManagement();
		
		i2.setProductName(productName);
		i2.setProductDescription(description);
		i2.setProductAvailability(product_availability);
		i2.setProductPrice(price);
		
		String result = inventoryService.insertProduct(i2);
		System.out.println(result);
		
	}
	
	public void getUpdteProduct()
	{
		System.out.println("Enter Id to update product: ");
		int id = sc.nextInt();
		
		System.out.println("Update Product Availability: ");
		int product_availability = sc.nextInt();
		
		System.out.println("Update Price of product:");
		double price = sc.nextDouble();
		
		InventoryManagement i2 = new InventoryManagement();
		
		i2.setProductAvailability(product_availability);
		i2.setProductPrice(price);
		
		String result = inventoryService.updateProduct(id, product_availability, price);
		System.out.println(result);
	}
	
	public void getproductById()
	{
		System.out.println("Enter Id to get product details: ");
		int id = sc.nextInt();
		
		Optional<InventoryManagement> i2 = inventoryService.findProductById(id);
		System.out.println(i2);
	}
	
	public void getAllProducts()
	{
		Iterable<InventoryManagement> i2 = inventoryService.findAllProduct();
		System.out.println(i2);
	}
	
	public void getProductDeleteById()
	{
		System.out.println("Enter a Id to delete product: ");
		int id = sc.nextInt();
		
		String result = inventoryService.deleteProductById(id);
		System.out.println(result);
	}
}





























