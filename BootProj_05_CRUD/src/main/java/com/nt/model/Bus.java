package com.nt.model;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	private int busNo;
	private String busName;
	private String busColor;
	private double ticketPrice;
	private String startsFrom;
	private String endsTo;

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusColor() {
		return busColor;
	}

	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getStartsFrom() {
		return startsFrom;
	}

	public void setStartsFrom(String startsFrom) {
		this.startsFrom = startsFrom;
	}

	public String getEndsTo() {
		return endsTo;
	}

	public void setEndsTo(String endsTo) {
		this.endsTo = endsTo;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busName=" + busName + ", busColor=" + busColor + ", ticketPrice="
				+ ticketPrice + ", startsFrom=" + startsFrom + ", endsTo=" + endsTo + "]";
	}

}
