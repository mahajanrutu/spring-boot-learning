package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.ICustomerDAO;
import com.nt.model.Customer;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
	private ICustomerDAO customerDAO;
	@Override
	public String addData(Customer customer) {
		int inserted = customerDAO.insert(customer);
		return inserted !=0 ? "Customer Detail Inserted Sucessfully....": "Something went Wrong";
	}

	@Override
	public String deleteData(int customerId) {
	   int  delete = customerDAO.delete(customerId);
		return delete !=0? "Customer data Deleted...": "Not Deleted";
	}

	@Override
	public String updateData(long phoneNo, int customerId) {
		int update = customerDAO.update(phoneNo, customerId);
		return update !=0 ? "Customer PhoneNumber Updated...": "Something went wrong";
	}

	@Override
	public List<Customer> showData() {
		
		return customerDAO.retrive();
	}
	
	@Override
    public Customer showByEmail(String email)
    {
    	return customerDAO.searchByEmail(email);
    }

}
