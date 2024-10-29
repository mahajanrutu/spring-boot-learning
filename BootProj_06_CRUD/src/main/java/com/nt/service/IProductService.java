package com.nt.service;

import java.util.List;

import com.nt.model.Product;

public interface IProductService {
    public String add(Product product);
    
    public String remove(int productId);
    
    public List<Product> showData();
    
    public String updateData(String productName, String description, int productId);
}
