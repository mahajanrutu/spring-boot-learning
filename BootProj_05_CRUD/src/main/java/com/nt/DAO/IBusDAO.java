package com.nt.DAO;

import java.util.List; 

import com.nt.model.Bus;

public interface IBusDAO {
	public int insert(Bus bus);

	public List<Bus> retriveBusData();
	
}
