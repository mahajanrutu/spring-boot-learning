package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.model.IDelivery;
@Component
public class FlipkartService {
	@Autowired
	@Qualifier("ecom")
    private IDelivery delivery;

	public IDelivery getDelivery() {
		return delivery;
	}

	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}
    
    public void deliveryService()
    {
    	delivery.itemDelivery();
    }
}