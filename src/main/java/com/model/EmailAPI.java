package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailAPI {

	
	@Autowired
	MailSender mailsend;
	public void mailmethod(String toAddress, String fromAddress, String subject, String msgBody){
	try{	SimpleMailMessage msgdetails = new SimpleMailMessage();
		msgdetails.setFrom(fromAddress);
		msgdetails.setTo(toAddress);
		msgdetails.setSubject(subject);
		msgdetails.setText(msgBody);
		mailsend.send(msgdetails);}
	catch(Exception e){
		e.getMessage();
	}
	}
	
	
}
