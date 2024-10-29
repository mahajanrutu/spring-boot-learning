package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface IBookMgmtService {
	public String add(Book book);

	public List<Book> show();
}
