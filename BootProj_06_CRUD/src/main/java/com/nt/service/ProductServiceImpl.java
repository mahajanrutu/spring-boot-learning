package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IProductDAO;
import com.nt.model.Product;
@Service
public class ProductServiceImpl implements IProductService {
      @Autowired
	 private IProductDAO productDAO;
	@Override
	public String add(Product product) {
		int inserted = productDAO.insert(product);
   		return inserted !=0 ? "Product Inserted Sucessfully": "Something went wrong";
	}
   
	@Override
	public String remove(int productId) {
		int removed = productDAO.delete(productId);
		return removed !=0 ? "Product Deleted Sucessfully..." : "Not Deleted";
	}
	
	@Override
	public List<Product> showData(){
		return productDAO.getAllData();
	}
	
	@Override
	public String updateData(String productName, String description, int productId)
	{
		int updated = productDAO.update(productName, description, productId);
		return updated !=0 ? "Product Updated Sucessfully" : "Something Went Wrong";
	}
}
