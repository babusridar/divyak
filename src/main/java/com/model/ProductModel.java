package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity(name="PRODUPD")
@Component
public class ProductModel {
	@NotEmpty(message="Description field is mandatory.")
	private String description;
	@NotNull(message="Field is mandatory")
	@NumberFormat(style = Style.NUMBER)
	private double price;
	@NotEmpty(message="Filed is mandatory")
	private String category;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	
	@NotEmpty(message="filed is mandatory")
	private String name;
	
	@Transient
	private MultipartFile filename;
	
	@NotEmpty(message="Field is mandatory")
	private String imagename;
	@Column
	@NotEmpty(message="Field is mandatory")
	private String brand;
	@Column
	@NotNull(message="Field is mandatory")
	@NumberFormat(style = Style.NUMBER,pattern="###")
	private Integer quantity;
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}	
	
	
	public MultipartFile getFilename() {
		return filename;
	}
	public void setFilename(MultipartFile filename) {
		this.filename = filename;
	}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

		public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		public String getCategory() {
		return category;
	}
	public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
	public void setCategory(String category) {
		this.category = category;
	}
}
