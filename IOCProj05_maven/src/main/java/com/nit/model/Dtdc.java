package com.nit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class Dtdc implements IDelivery {
	@Value("${Flipkart.coupon_dtdc}")
    private String coupon;
	@Override
	public void itemDelivery() {
       System.out.println("Your item is Deliverd by DTDC services, You got the Coupon on next purches:"+coupon);
	}

}
