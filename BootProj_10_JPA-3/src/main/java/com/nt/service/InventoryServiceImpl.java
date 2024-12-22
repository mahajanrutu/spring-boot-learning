package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.InventoryManagement;
import com.nt.repository.InventoryRepo;
@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepo inventoryRepo;

	@Override
	public String insertProduct(InventoryManagement inventory) {
		InventoryManagement i = inventoryRepo.save(inventory);
		return "Product saved sucessfully with id: "+i.getProductId();
	}

	@Override
	public String updateProduct(int id, int product_availability, double price) {
		if(inventoryRepo.existsById(id))
		{
			InventoryManagement i= inventoryRepo.findById(id).get();
			
			i.setProductAvailability(product_availability);
			i.setProductPrice(price);
			
			inventoryRepo.save(i);
			return "Updated Sucessfully...";
		}
		else
		{
		return "Something went wrong, Data not updated..";
		}
	}

	@Override
	public Optional<InventoryManagement> findProductById(int id) {
			return inventoryRepo.findById(id);
	}

	@Override
    public Iterable<InventoryManagement> findAllProduct()
	{
		return inventoryRepo.findAll();
	}

	@Override
	public String deleteProductById(int id) {
		if(inventoryRepo.existsById(id))
		{
			inventoryRepo.deleteById(id);
		return "Product details with "+id+ "is deleted sucessfully...";
		}
		else{
			return "Product id "+id+ "not found";
		}
		
	}

}
