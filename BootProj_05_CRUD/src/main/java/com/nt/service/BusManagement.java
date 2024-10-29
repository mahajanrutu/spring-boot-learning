package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IBusDAO;
import com.nt.model.Bus;

@Service
public class BusManagement implements IBusManagement {
	@Autowired
	private IBusDAO busDAO;

	@Override
	public String add(Bus bus) {
		int inserted = busDAO.insert(bus);
		return inserted != 0 ? "Bus Data Inserted Successfully" : "Something went wrong...";
	}

	@Override
	public List<Bus> show() {
		return busDAO.retriveBusData();
	}
}
