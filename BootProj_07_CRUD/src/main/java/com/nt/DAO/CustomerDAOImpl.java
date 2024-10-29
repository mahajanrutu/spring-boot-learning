package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

	private final String INSERTION_QUERY = "INSERT INTO CUSTOMER(CId, CName, Email, Phone) VALUES (Seq_Customer.NEXTVAL,?,?,?)";
	private final String DELETE_QUERY = "DELETE FROM CUSTOMER WHERE CId=?";
	private final String UPDATE_QUERY = "UPDATE CUSTOMER SET Phone=? WHERE CID=?";
	private final String RETRIVE_QUERY = "SELECT * FROM CUSTOMER";
	private final String SEARCH_QUERY = "SELECT * FROM CUSTOMER WHERE Email=?"; 
	@Autowired
	private DataSource ds;

	@Override
	public int insert(Customer customer) {
		int rowUpdate = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERTION_QUERY);
			ps.setString(1, customer.getCustomerName());
			ps.setString(2, customer.getEmailId());
			ps.setDouble(3, customer.getPhoneNo());

			rowUpdate = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdate;
	}

	@Override
	public int delete(int customerId) {
		int rowUpdate = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE_QUERY);

			ps.setInt(1, customerId);

			rowUpdate = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdate;
	}

	@Override
	public int update(long phoneNo, int customerId) {
		int rowUpdate = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);

			ps.setDouble(1, phoneNo);
			ps.setInt(2, customerId);

			rowUpdate = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdate;
	}

	@Override
	public List<Customer> retrive() {
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(RETRIVE_QUERY);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();

				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(2));
				customer.setEmailId(rs.getString(3));
				customer.setPhoneNo(rs.getLong(4));

				customerList.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
    
	@Override
    public Customer searchByEmail(String email)
    {
		Customer customer = null;
    	try {
    		Connection con = ds.getConnection();
    		PreparedStatement ps = con.prepareStatement(SEARCH_QUERY);
    		ps.setString(1, email);
    		
    		ResultSet rs = ps.executeQuery();
    		while(rs.next()) {
    		     customer = new Customer();
    			
    			customer.setCustomerId(rs.getInt(1));
    			customer.setCustomerName(rs.getString(2));
    		    customer.setEmailId(rs.getString(3));
    		    customer.setPhoneNo(rs.getLong(4));
    		}
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return customer;
    }


}
