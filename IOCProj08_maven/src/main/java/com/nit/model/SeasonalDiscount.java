package com.nit.model;

import org.springframework.stereotype.Component;

@Component("sd")
public class SeasonalDiscount implements IDiscount {

	@Override
	public double applyDiscount(double orignalPrice) {
		return orignalPrice *0.3;
	}

	
}
