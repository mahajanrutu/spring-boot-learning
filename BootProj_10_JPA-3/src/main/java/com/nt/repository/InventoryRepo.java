package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.InventoryManagement;

public interface InventoryRepo extends CrudRepository<InventoryManagement, Integer>{

}
