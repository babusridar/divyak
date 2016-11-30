package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.ProductModel;
import com.service.ProductService;
import com.service.RegisterService;

@Controller
public class Homecontroller {
	//@Autowired
	//LoginService ls;
	@Autowired
	RegisterService rs;
	
	@Autowired
	ProductService productservice;

	@RequestMapping(value ={"/","/home","admin/home"})
	public String home(Map<String, Object>map) {

		ProductModel productmodelResult = new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllProductModel());
	    
		return "index";
	}
	@RequestMapping(value="/admin/one")
	public String valid()
	{
		return "Admin";
	}
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getlogin(ModelMap map,HttpServletRequest req) {
		return "Login";
	}

	
	@RequestMapping(value="p001")
	public String p1(){
		return "p001";
	}
	@RequestMapping(value="bangles")
	public String sss(){
		return "bangles";
	}
	@RequestMapping(value="chain")
	public String sgf(){
		return "chain";
	}
	@RequestMapping(value="rings")
	public String fkh(){
		return "rings";
	}

	@RequestMapping(value = "/headphones")
	public String cat1() {
		return "Headphones";
	}
/*	@ModelAttribute("Reg")
	public Newuser getNewuser() {
		return new Newuser();
	}	@RequestMapping(value = "/register")
	public String gtReg() {
		return "rs";
	}

	@RequestMapping(value = "/fregister", method = RequestMethod.POST)
	public ModelAndView reguser(@ModelAttribute("Reg") Newuser newuser) {
		System.out.println(newuser);
		rs.s(newuser);	
		ModelAndView mc =new ModelAndView("login");
		return mc;	
	}
*/
}
