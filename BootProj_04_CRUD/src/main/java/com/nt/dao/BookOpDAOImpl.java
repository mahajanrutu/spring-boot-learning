package com.nt.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Book;
@Repository
public class BookOpDAOImpl implements BookOpDAO {
	private final String INSERTION_QUERY = "INSERT INTO BOOKLIB (name, author, price, quantity) VALUES (?,?,?,?)";
	private final String RETRIEVE_QUERY = "SELECT * FROM BOOKLIB";
	@Autowired
	private DataSource ds;

	@Override
	public int insert(Book book) {
		int rowUpdated = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERTION_QUERY);
			ps.setString(1, book.getName());
			ps.setString(2, book.getAuthor());
			ps.setDouble(3, book.getPrice());
			ps.setInt(4, book.getQuantity());

			rowUpdated = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowUpdated;
	}

	@Override
	public List<Book> retriveAllBook() {
		List<Book> bookList = new ArrayList<Book>();
		try {
			 Connection con= ds.getConnection();
			 PreparedStatement ps = con.prepareStatement(RETRIEVE_QUERY);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 Book book = new Book();
				 book.setId(rs.getInt(1));
				 book.setName(rs.getString(2));
				 book.setAuthor(rs.getString(3));
				 book.setPrice(rs.getDouble(4));
				 book.setQuantity(rs.getInt(5));
				 
				 bookList.add(book);
				 }
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return bookList;
	}

}
