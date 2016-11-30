package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import com.controller.CartController;
import com.service.Cartservice;

@Component
public class Checkouthandler {
	public Shipping initFlow() {
		return new Shipping();
	}
	@Autowired
	static Cartuser uc;

	@Autowired
	Cartservice cs;

	@Autowired
	CartController cartclr;

	@Autowired
	EmailAPI mailtouser;

	public String username;

	
	public void updatedeatils(Shipping shippingdetails) {

		username = cartclr.onnumilla();
		System.out.println("cartdetails" + username);
		System.out.println("updtentrl" + username);
		Cartuser cud = new Cartuser();
		List<Cart> cu = cs.getAllCart(username);
		double tot = 0;
		for (int i = 0; i < cu.size(); i++) {
			tot += cu.get(i).getTotalprice();
		}
		cud.setGrandtotal(tot);
		cud.setShippingdetails(shippingdetails);
		cs.addbuy(cud, username);
		System.out.print("ADDED CRT ITEMS");
		//Checkouthandler ch = new Checkouthandler();
		Checkouthandler.setUc(cud);
			}

	public void save(Shipping shippingdetails) {
		String username = cartclr.onnumilla();

		System.out.println("control" + username);
		cs.saveshipment(shippingdetails, username);

	}

	
	

	
	public static Cartuser getUc() {
		return uc;
	}

	public static void setUc(Cartuser uc) {
		Checkouthandler.uc = uc;
	}

	public String validateDetails(Shipping shippingdetails, MessageContext messageContext) {
		String status = "success";
		if (shippingdetails.getSname().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("sname").defaultText("Name Cannot Be Empty").build());
			status = "failure";
		}
		if (shippingdetails.getAddr1().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("Addr1").defaultText("This Field cannot be Empty").build());
			status = "failure";
		}
		if (shippingdetails.getAddr2().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("Addr2").defaultText("This Field cannot be Empty").build());
			status = "failure";
		}
		if (shippingdetails.getAddr3().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("Addr3").defaultText("This Field cannot be Empty").build());
			status = "failure";
		}
		if (shippingdetails.getCity().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("City").defaultText("password cannot be Empty").build());
			status = "failure";
		}
		if (shippingdetails.getPincode().isEmpty()) {
			messageContext.addMessage(
					new MessageBuilder().error().source("pincode").defaultText("Pincode not valid").build());
			status = "failure";
		}

		if (shippingdetails.getPhoneNumber().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("phoneNumber")
					.defaultText("PHONE NUMBER cannot be Empty").build());
			status = "failure";
		}

		return status;

	}

}