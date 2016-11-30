package com.dao;

import java.util.List;

import com.model.Order;
import com.model.ProductModel;

public interface ProductDao {

public 	void add(ProductModel productModel);

public void edit(ProductModel productModel);

public void delete(int getId);

public ProductModel getProductModel(int getId);

public List<ProductModel> getAllProductModel();
/*
public List<ProductModel> getAllHeadPhones();
public List<ProductModel> getAllCases();
public List<ProductModel> getAllChargers();
public List<ProductModel> getAllScreenGuard();
public List<ProductModel> getAllCables();
public List<ProductModel> getAllStorge();
*/
public List<ProductModel> getAllCaregory(String Category);

public List<Order> getalloderds();

}
