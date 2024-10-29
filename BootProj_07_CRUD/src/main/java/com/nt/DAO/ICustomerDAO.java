package com.nt.DAO;

import java.util.List;

import com.nt.model.Customer;

public interface ICustomerDAO {
     public int insert(Customer customer);
     
     public int delete(int customerId);
     
     public int update(long phoneNo, int customerId);
     
     public List<Customer> retrive();
     
     public Customer searchByEmail(String email);
}
