package com.nt.service;

import java.util.List;

import com.nt.model.Customer;

public interface ICustomerService {
     public String addData(Customer customer);
     
     public String deleteData(int customerId);
     
     public String updateData(long phoneNo, int customerId);
     
     public List<Customer> showData();
     
     public Customer showByEmail(String email);
}
