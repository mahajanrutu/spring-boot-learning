package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Email;
import com.nt.service.IEmailService;


@Controller
public class EmailController {
	
    @Autowired
    IEmailService emailService;
    
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/sendMail")
	public String sendMail(@ModelAttribute Email email)
	{
		System.out.println("Received email:");
        System.out.println("To: " + email.getTo());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Message: " + email.getMessage());
        emailService.sendEmailWithAttachment(email.getTo(), email.getSubject(), email.getMessage());
        return "redirect:/";
	}
}
