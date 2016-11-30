package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.springframework.stereotype.Component;

@Entity(name = "SHIPPEDCART")
@Component
public class Cartuser {

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public Shipping getShippingdetails() {
		return shippingdetails;
	}

	public void setShippingdetails(Shipping shippingdetails) {
		this.shippingdetails = shippingdetails;
	}

	
	public double grandtotal;
	

	public double getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int cartid;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Shipping.class)
	private Shipping shippingdetails;

}
