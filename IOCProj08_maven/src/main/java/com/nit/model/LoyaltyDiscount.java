package com.nit.model;

import org.springframework.stereotype.Component;

@Component("ld")
public class LoyaltyDiscount implements IDiscount {

	@Override
	public double applyDiscount(double orignalPrice) {
		return orignalPrice * 0.1;
	}

}
