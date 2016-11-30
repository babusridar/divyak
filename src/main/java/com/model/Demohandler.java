package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import com.service.RegisterService;



@Component
public class Demohandler {

	public Newuser initFlow(){
		return new Newuser();
	}
	@Autowired
	EmailAPI mailtouser;
	
	
	
	public void send(Newuser newuser) 
	
	{
	try{
		String toAddr = newuser.getEmail();
		String fromAddr = "divyakarunakaran1994@gmail.com";
 
		// email subject
		String subject = "Mobiaces wewlcomes you";
 
		// email body
		String body = "Welcome to the Mobiaces "+newuser.getFname()+"."+System.getProperty("line.separator")
				+"Thanks to begin with us."+System.getProperty("line.separator")
				+System.getProperty("line.separator")
				+System.getProperty("line.separator")
				+System.getProperty("line.separator")
				+ "------------"+System.getProperty("line.separator")
				+ "-Mobiaces";
		mailtouser.mailmethod(toAddr, fromAddr, subject, body);
		
		
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	}
	@Autowired
	RegisterService rs;
	public void save(Newuser newuser)
	{
		rs.s(newuser);
	}
	
	public String validateDetails(Newuser newuser,MessageContext messageContext){
		List<Newuser> l=rs.getuser();
		String status = "success";
		if(newuser.getFname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"fname").defaultText("Name Cannot Be Empty cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}else{
			for(Newuser nml:l)
			{
					String mail=nml.getEmail();
			if(newuser.getUsername().equals(mail)){
				messageContext.addMessage(new MessageBuilder().error().source(
						"email").defaultText("Email Already Registered").build());
				status = "failure";
			}
			}
		}
		if(newuser.getAge().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"age").defaultText("Age cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getUsername().isEmpty()){
			
			messageContext.addMessage(new MessageBuilder().error().source(
					"username").defaultText("UserName cannot be Empty").build());
			status = "failure";
			}
		else{
			
			for(Newuser nm:l)
			{
					String user=nm.getUsername();
			if(newuser.getUsername().equals(user)){
				messageContext.addMessage(new MessageBuilder().error().source(
						"username").defaultText("UserName Already Available").build());
				status = "failure";
			}
			}
		}
		if(newuser.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("password cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getcPassword().isEmpty()){			
			messageContext.addMessage(new MessageBuilder().error().source(
					"cPassword").defaultText("Conformation password not valid").build());
			status = "failure";
			
		}
		if(newuser.getPhnumber().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"phnumber").defaultText("PHONE NUMBER cannot be Empty").build());
			status = "failure";
		}
			
		return status;
	}
}