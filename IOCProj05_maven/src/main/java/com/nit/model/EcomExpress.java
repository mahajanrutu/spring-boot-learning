package com.nit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ecom")
public class EcomExpress implements IDelivery {
	@Value("${Flipkart.coupon_ecom}")
    private String coupon;
	@Override
	public void itemDelivery() {
      System.out.println("Your item is Deliverd by Ecom Express Sevices, You got a Coupon on next purches: "+coupon);
	}

}
