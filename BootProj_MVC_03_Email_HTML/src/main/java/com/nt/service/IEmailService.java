package com.nt.service;

public interface IEmailService {
//    public void sendEmail(String to, String subject, String message);
     
    public void sendEmailWithAttachment(String to, String subject, String message);
}
