package com.nit.model;

import org.springframework.stereotype.Component;

@Component("bp")
public class BulkPurchaseDiscount implements IDiscount {

	@Override
	public double applyDiscount(double orignalPrice) {
		if(orignalPrice>100)
		{
		return orignalPrice * 0.2;
		}
		return orignalPrice;
	}

}
