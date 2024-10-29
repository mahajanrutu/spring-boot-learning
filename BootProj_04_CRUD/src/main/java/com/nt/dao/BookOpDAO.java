package com.nt.dao;

import java.util.List;

import com.nt.model.Book;

public interface BookOpDAO {
      public int insert(Book book);
      public List<Book> retriveAllBook();
}
