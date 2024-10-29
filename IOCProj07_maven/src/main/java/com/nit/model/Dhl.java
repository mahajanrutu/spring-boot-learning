package com.nit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dhl")
public class Dhl implements IDelivery {
	@Value("${Flipkart.coupon_dhl}")
    private String coupon;
	@Override
	public void itemDelivery() {
       System.out.println("Your item is Deliverd by DHL Services, You got the Coupon on next purches:"+coupon);
	}

}
