package com.nt.DAO;

import java.util.List;

import com.nt.model.Product;

public interface IProductDAO {
     public int insert(Product product);
     
     public int delete(int productId);
     
     public List<Product> getAllData();
     
     public int update(String productName, String description, int productId);
}
