package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Product;

@Repository
public class ProductDAOimpl implements IProductDAO {

	private final String INSERTION_QUERY = "INSERT INTO PRODUCT(ProductId, ProductName, Description, Price) VALUES (product_seq.NEXTVAL,?,?,?)";
	private final String DELETE_QUERY = "DELETE FROM PRODUCT WHERE ProductId = ?";
	private final String RETRIVE_DATA = "SELECT * FROM PRODUCT";
	private final String UPDATE_QUERY = "UPDATE PRODUCT SET ProductName=?, Description=? WHERE ProductId = ?";
	@Autowired
	private DataSource ds;

	@Override
	public int insert(Product product) {
		int rowUpdated = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERTION_QUERY);
			ps.setString(1, product.getProductName());
			ps.setString(2, product.getDescription());
			ps.setDouble(3, product.getPrice());

			rowUpdated = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowUpdated;
	}

	@Override
	public int delete(int productId) {
		int rowUpdated = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
			ps.setInt(1, productId);

			rowUpdated = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	@Override
	public List<Product> getAllData() {
		List<Product> productList = new ArrayList<Product>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(RETRIVE_DATA);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getDouble(4));

				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return productList;

	}
	
	public int update(String productName, String description, int productId) {
		int rowUpdated = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
			
			ps.setString(1, productName);
			ps.setString(2,description);
			ps.setInt(3, productId);
			
			rowUpdated = ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rowUpdated;
	}
}
