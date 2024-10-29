	package com.nt.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Bus;
import com.nt.service.IBusManagement;

@Controller
public class BusController {
	@Autowired
	private IBusManagement busManagement;

	Scanner sc = new Scanner(System.in);

	public void addBus() {
		System.out.println("Enter Bus Number: ");
		int busNo = sc.nextInt();
		System.out.println("Enter Bus Name: ");
		String busName = sc.nextLine();
		busName = sc.nextLine();
		System.out.println("Enter Bus Colour: ");
		String busColor = sc.nextLine();
		System.out.println("Enter Ticket Price: ");
		double ticketPrice = sc.nextDouble();
		System.out.println("Enter Journey Starts from: ");
		String startsFrom = sc.nextLine();
		startsFrom = sc.nextLine();
		System.out.println("Enter Journey End Destination: ");
		String endsTo = sc.nextLine();

		Bus bus = new Bus();
		bus.setBusNo(busNo);
		bus.setBusName(busName);
		bus.setBusColor(busColor);
		bus.setTicketPrice(ticketPrice);
		bus.setStartsFrom(startsFrom);
		bus.setEndsTo(endsTo);

		String result = busManagement.add(bus);
		System.out.println(result);
	}

	public void showBus() {
		List<Bus> list = busManagement.show();
		list.forEach(System.out::println);
	}
}
