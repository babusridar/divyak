package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

@Entity(name = "Shipping_Details")
@Component
public class Shipping implements Serializable{private static final long serialVersionUID = 4657462015039726030L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	public String mailId;
	

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@NotNull(message = "NAME is mandatory for Shipping")
	public String sname;

	@NotEmpty(message = "Phone Number is Mandatory for Shipping")
	@NumberFormat(pattern = "")
	public String PhoneNumber;

	@NotNull(message = "Files is Mandatory")
	public String Addr1;

	@NotNull(message = "Filed is mandatory")
	public String Addr2;

	public String Addr3;

	@NotNull
	public String City;

	@NotEmpty(message = "Pincode to Delivery")
	@Length(min = 6, max = 6, message = "Length Must Be Six")
	public String pincode;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddr1() {
		return Addr1;
	}

	public void setAddr1(String addr1) {
		Addr1 = addr1;
	}

	public String getAddr2() {
		return Addr2;
	}

	public void setAddr2(String addr2) {
		Addr2 = addr2;
	}

	public String getAddr3() {
		return Addr3;
	}

	public void setAddr3(String addr3) {
		Addr3 = addr3;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
