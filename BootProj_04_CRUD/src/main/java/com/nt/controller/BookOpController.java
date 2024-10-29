
package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Book;
import com.nt.service.IBookMgmtService;
@Controller
public class BookOpController {

	@Autowired
	private IBookMgmtService service;
	
	Scanner sc = new Scanner(System.in);
	public void addBook()
	{
		System.out.print("Enter Book name: ");
		String name = sc.nextLine();
		System.out.print("Enter Book author: ");
		String author = sc.nextLine();
		System.out.print("Enter Book price: ");
		double price = sc.nextDouble();
		System.out.print("Enter Book quantity: ");
		int qty =  sc.nextInt();
		
		Book book = new Book();
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
		book.setQuantity(qty);
		
		String result = service.add(book);
		System.out.println(result);
		}
	
	public List<Book> showBook()
	{
		return service.show();
	}
}
