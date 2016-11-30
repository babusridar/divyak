package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.ProductModel;
import com.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private ProductService productservice;
	
	@RequestMapping(value="/home/{category}")
	public String getCategory(Map<String, Object> map,@PathVariable("category") String Category){
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllCaregory(Category));
	    return "Category";
	}
	
	/*@RequestMapping(value="/Headphones")
	public String head(Map<String, Object> map)
	{
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllHeadPhones());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value="/Chargers")
	public String Crg(Map<String, Object> map)
	{
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllChargers());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value="/screen")
	public String head2(Map<String, Object> map)
	{
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllScreenGuard());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value="/cables")
	public String head3(Map<String, Object> map)
	{
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllCables());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value="/memory")
	public String head4(Map<String, Object> map)
	{
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllStorge());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value="/cases")
	public String head5(Map<String, Object> map)
	{
		ProductModel productmodelResult=new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllCases());
	  System.out.println(productmodelResult);
		return "Category";	
}*/
}