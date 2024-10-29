package com.nt.service;

import java.util.List;


import com.nt.model.Bus;

public interface IBusManagement {
	public String add(Bus bus);

	public List<Bus> show();
}
