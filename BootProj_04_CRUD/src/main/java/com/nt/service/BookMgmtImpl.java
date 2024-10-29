package com.nt.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BookOpDAO;
import com.nt.model.Book;
@Service
public  class BookMgmtImpl implements IBookMgmtService {

	@Autowired
	private BookOpDAO bookDAO;
	
	@Override
	public String add(Book book) {
		int inserted = bookDAO.insert(book);
		return inserted != 0 ? "Book inserted successfully":"Something went wrong..";
	}
    @Override
    
	public List<Book> show()
	{
		return bookDAO.retriveAllBook();
		   
	}

}
