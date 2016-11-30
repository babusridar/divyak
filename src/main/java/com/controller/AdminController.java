package com.controller;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.model.Order;
import com.model.ProductModel;
import com.service.Cartservice;
import com.service.ProductService;

@Controller
public class AdminController {
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	Cartservice cs;
	
	@ModelAttribute("ob")
	public ProductModel construct(){
		return new ProductModel();
	
	}
	@Autowired
	ProductService productservice;
	@RequestMapping(value="/viewall")
	public String prod1(Map<String, Object>map)
	{
		ProductModel productmodelResult = new ProductModel();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllProductModel());
	    
	return "Viewall";	
	}
	@RequestMapping(value="/wat")
	public @ResponseBody List<ProductModel> getAllProductModel()
	{
		List<ProductModel> p=null;
		System.out.print("hai");
	try{
			p=productservice.getAllProductModel();
		System.out.println(p);
		}
		catch(Exception e){
			p=null;
		}
	System.out.println(p);
		return p;
	}
	
	
	
	@RequestMapping(value="/edit/{productid}")
	public String edit(@PathVariable("productid")int id,@ModelAttribute ProductModel productModel,Map<String, Object>map)
	{
		
		productModel=productservice.getProductModel(id);
		map.put("productModel",productModel);
	//	map.put("productmodelList", productservice.getAllProductModel());
	    return "product";
	}
	@RequestMapping(value="/delete/{productid}")
	public String delete(@PathVariable("productid")int id,@ModelAttribute ProductModel productModel,Map<String, Object>map)
	
	{
	productservice.delete(id);
	return "redirect:/viewall";
}
	@RequestMapping(value="/product")
	public String prod()
	{
	return "product";	
	}
	
	@RequestMapping(value={"/productmodel","edit/productmodel"}, method=RequestMethod.POST)
	public String doActions(@Valid @ModelAttribute ProductModel productModel, BindingResult result, @RequestParam String action, Map<String, Object>map){
		if(result.hasErrors())
		{
			System.out.println(result);
			return "product";
		}else
		{
		ProductModel productmodelResult = new ProductModel();
	    switch(action.toLowerCase()){
	    case "add":
	    	MultipartFile file= productModel.getFilename();
	    	
	    	if (!file.isEmpty()) {
				try {
					
					// Creating the directory to store file
					File path = new File(servletContext.getRealPath("/") );
					File dir = new File(path + File.separator + "resources/admin/upload");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					File serverFile = new File(dir
							+ File.separator + productModel.getImagename()+".jpg");
		
					System.out.println(serverFile);
					file.transferTo(serverFile);
					System.out.println(file);
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			
	    	}
	    	productservice.add(productModel);
	    	productmodelResult = productModel;
	    	break;
	    	
	    case "update":
	    	MultipartFile files= productModel.getFilename();
	    	productservice.edit(productModel);
	    	if (!files.isEmpty()) {
				try {
					
					// Creating the directory to store file
					File paths = new File(servletContext.getRealPath("/") );
					File dir = new File(paths + File.separator + "resources/admin/upload");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					File serverFile = new File(dir
							+ File.separator + productModel.getImagename()+".jpg");
		
					System.out.println(serverFile);
					files.transferTo(serverFile);
					System.out.println(files);
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			
	    	}
	    	
	    	productmodelResult = productModel;
	    	break;
	    	
	    case "delete":
	    	productservice.delete(productModel.getProductid());
	    	productmodelResult = new ProductModel();
	    	break;
	    	
	    case "search":
	    	ProductModel searchedProductModel = productservice.getProductModel(productModel.getProductid());
	    	productmodelResult = searchedProductModel!=null ? searchedProductModel : new ProductModel();
	    	break;
	    }
	    map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllProductModel());
	    
		
	}
		return "redirect:/product";
	}
	@RequestMapping(value="/viewproduct/{productid}")
	public String view(@PathVariable(value="productid")int id,@ModelAttribute ProductModel productModel,Map<String, Object>map)
	{
		productModel=productservice.getProductModel(id);
		System.out.println("view"+productModel.getName());
		map.put("productModel",productModel);
		//map.put("productmodelList", productModel);
		return 	"productview";
	}

}
