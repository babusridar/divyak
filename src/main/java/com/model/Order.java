package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.stereotype.Component;

@Entity(name="FINALTBL")
@Component
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,targetEntity=Cartuser.class)
	private Cartuser cartdetails;
	
	private String orderdate;
	
	private String status;
	
	private String username;

	public int getOrderId() {
		return orderId;
	}
	private String productname;
	
	private Double poductprice;
	
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Double getPoductprice() {
		return poductprice;
	}

	public void setPoductprice(Double poductprice) {
		this.poductprice = poductprice;
	}
	private  int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	private double totalprice;
	

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Cartuser getCartdetails() {
		return cartdetails;
	}

	public void setCartdetails(Cartuser cartdetails) {
		this.cartdetails = cartdetails;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

