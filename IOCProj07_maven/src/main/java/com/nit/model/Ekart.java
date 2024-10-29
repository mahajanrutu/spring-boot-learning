package com.nit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ekart")
public class Ekart implements IDelivery {
    @Value("${Flipkart.coupon_ekart}")
	private String coupon;
	@Override
	public void itemDelivery() {
        System.out.println("Your Item is Deliverd by Ekart Services, You got the Coupon on next purches: "+coupon);
	}

}
