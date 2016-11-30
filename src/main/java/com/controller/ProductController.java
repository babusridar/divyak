package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.model.ProductModel;
import com.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	public void deleteproductquantity(int id) {
		ProductModel pm = ps.getProductModel(id);
		int quantity = pm.getQuantity();
		if (quantity == 1) {
			pm.setQuantity(0);
			ps.edit(pm);
		} else {
			pm.setQuantity(quantity - 1);
			ps.edit(pm);
		}
	}
	public void addproctquantity(int productid,int cartquantity)
	{
		ProductModel pm = ps.getProductModel(productid);
		pm.setQuantity(pm.getQuantity()+cartquantity);
		ps.edit(pm);
	}

}
