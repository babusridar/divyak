package com.service;

import java.util.List;

import com.model.Cart;
import com.model.Cartuser;
import com.model.Order;
import com.model.Shipping;

public interface Cartservice {

	

	void add(Cart cart);

	public List<Cart> getAllCart(String username);

	//void odadd(Shipping sh);

	void addbuy(Cartuser cud, String username);

	void saveshipment(Shipping shippingdetails, String username);

	List<Cartuser> getCartforuser(int sid);

	void addord(Order order);

	void update(Cart cart);

	Cartuser getdetails(int sid);

	void deletecartitem(int cid);

	void deleteallcartitem(String username);

	public Cart getcartitembyid(int cartitemid);

	List<Order> getHistory(String username);


}
