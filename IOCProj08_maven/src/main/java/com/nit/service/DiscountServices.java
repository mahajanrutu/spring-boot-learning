package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.model.IDiscount;
@Service
public class DiscountServices {
	@Autowired
	@Qualifier("ld")
    private IDiscount discount;
	

	public IDiscount getDiscount() {
		return discount;
	}

	public void setDiscount(IDiscount discount) {
		this.discount = discount;
	}
    
    public double calculateFinalPrice(double orignalPrice) {
    	return discount.applyDiscount(orignalPrice);
    }
    
}
