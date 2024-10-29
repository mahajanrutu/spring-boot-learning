package com.nit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


import com.nit.service.FlipkartService;
@Component
@PropertySource("com/nit/commons/application.properties")
public class Flipkart {
	@Value("${Flipkart.coupon_ekart}")
	private String coupon_ekart;
	@Value("${Flipkart.coupon_dtdc}")
	private String coupon_dtdc;
	@Value("${Flipkart.coupon_dhl}")
	private String coupon_dhl;
	@Value("${Flipkart.coupon_ecom}")
	private String coupon_ecom;

	@Autowired
     private FlipkartService flipkart;
     
     public Flipkart() {
    	 
    	 
     }

	public FlipkartService getFlipkart() {
		return flipkart;
	}

	public void setFlipkart(FlipkartService flipkart) {
		this.flipkart = flipkart;
	}

	public String getCoupon_ekart() {
		return coupon_ekart;
	}

	public void setCoupon_ekart(String coupon_ekart) {
		this.coupon_ekart = coupon_ekart;
	}

	public String getCoupon_dtdc() {
		return coupon_dtdc;
	}

	public void setCoupon_dtdc(String coupon_dtdc) {
		this.coupon_dtdc = coupon_dtdc;
	}

	public String getCoupon_dhl() {
		return coupon_dhl;
	}

	public void setCoupon_dhl(String coupon_dhl) {
		this.coupon_dhl = coupon_dhl;
	}

	public String getCoupon_ecom() {
		return coupon_ecom;
	}

	public void setCoupon_ecom(String coupon_ecom) {
		this.coupon_ecom = coupon_ecom;
	}

	@Override
	public String toString() {
		return "Flipkart [coupon_ekart=" + coupon_ekart + ", coupon_dtdc=" + coupon_dtdc + ", coupon_dhl=" + coupon_dhl
				+ ", coupon_ecom=" + coupon_ecom + "]";
	}

	

	
     
     
}
