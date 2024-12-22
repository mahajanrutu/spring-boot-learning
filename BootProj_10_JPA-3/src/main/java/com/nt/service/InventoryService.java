package com.nt.service;

import java.util.Optional;

import com.nt.entity.InventoryManagement;

public interface InventoryService {
     public String insertProduct(InventoryManagement inventory);
     
     public  String updateProduct(int id, int product_availability, double price);
     
     public Optional<InventoryManagement> findProductById(int id);
     
     public Iterable<InventoryManagement> findAllProduct();
     
     public String deleteProductById(int id);
}
