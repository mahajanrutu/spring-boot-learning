package com.nt.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service
public class EmailServiceImpl implements IEmailService {

	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String emailFrom;
	
//	@Override
//	public void sendEmail(String to, String subject, String message) {
//		SimpleMailMessage msg = new SimpleMailMessage();
//		msg.setTo(to);
//		msg.setFrom(emailFrom);
//		msg.setSubject(subject);
//		msg.setText(message);
//		
//		sender.send(msg);
//	}
	
	@Override
    public void sendEmailWithAttachment(String to, String subject, String message)
    {  
	   MimeMessage msg = sender.createMimeMessage();
	   try {
		   MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		   helper.setTo(to);
		   helper.setFrom(emailFrom);
		   helper.setSubject(subject);
		   helper.setText(message);
		   helper.addAttachment("nit.jpg", new File("C:\\Users\\Hp\\Downloads\\nit.jpg"));
		   
		   sender.send(msg);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
    }


}
