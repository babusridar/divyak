package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.model.Order;
import com.model.ProductModel;
@Service
@Transactional
public class ProductServiceImpl  implements ProductService{
@Autowired(required=true)
private ProductDao productdao;

@Override	
public void add(ProductModel productModel){
	productdao.add(productModel);
	
}
@Override	
public void edit(ProductModel productModel){
	productdao.edit(productModel);
	
}
@Override	
public void delete(int getId){
	productdao.delete(getId);
	
}
@Override
public ProductModel getProductModel(int getId){
	return productdao.getProductModel(getId);
}
@Override
public List<ProductModel> getAllProductModel(){
	return productdao.getAllProductModel();
}
/*
@Override
public List<ProductModel> getAllHeadPhones() {
	
	return productdao.getAllHeadPhones();
}

@Override
public List<ProductModel> getAllCases() {
	
	return productdao.getAllCases();
}

@Override
public List<ProductModel> getAllChargers() {
	
	return productdao.getAllChargers();
}

@Override
public List<ProductModel> getAllScreenGuard() {

	return productdao.getAllScreenGuard();
}

@Override
public List<ProductModel> getAllCables() {

	return productdao.getAllCables();
}

@Override
public List<ProductModel> getAllStorge() {

	return productdao.getAllStorge();
}*/
@Override
public List<ProductModel> getAllCaregory(String Category) {
	
	return productdao.getAllCaregory(Category);
}
@Override
public List<Order> getallorders() {
	// TODO Auto-generated method stub
	return productdao.getalloderds();
}

}
