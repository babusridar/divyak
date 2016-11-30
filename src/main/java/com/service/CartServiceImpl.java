package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cartdao;
import com.model.Cart;
import com.model.Cartuser;
import com.model.Order;
import com.model.Shipping;

@Service
@Transactional
public class CartServiceImpl implements Cartservice{

	@Autowired
	Cartdao cd;
	@Override
	public void add(Cart cart) {
		
		cd.add(cart);
	}
	@Override
	public List<Cart> getAllCart(String username) {
		
		return cd.getAllCart(username);
	}
/*	@Override
	public void odadd(Shipping sh) {
		cd.odadd(sh);
	}*/
	@Override
	public void addbuy(Cartuser cud, String username) {
		cd.addbuy(cud,username);
		
	}
	@Override
	public void saveshipment(Shipping shippingdetails,String username) {
		// TODO Auto-generated method stub
		cd.saveshipment(shippingdetails,username);
	}
	@Override
	public List<Cartuser> getCartforuser(int sid) {
		// TODO Auto-generated method stub
		return cd.getCartforuser(sid);
	}
	@Override
	public void addord(Order order) {
		
		cd.saveorder(order);
	}
	@Override
	public void update(Cart cart) {
		// 
		cd.update(cart);
	}
	@Override
	public Cartuser getdetails(int sid) {
		// 
		return cd.getdetails(sid);
	}
	@Override
	public void deletecartitem(int cid) {
		// TODO Auto-generated method stub
	cd.deletecartitem(cid);	
	}
	@Override
	public void deleteallcartitem(String username) {
		// TODO Auto-generated method stub
		cd.deleteallcartitem(username);
	}
	@Override
	public Cart getcartitembyid(int cartitemid) {
		// 
		return cd.getCartdetbycid(cartitemid);
	}
	@Override
	public List<Order> getHistory(String username) {
		// TODO Auto-generated method stub
		return cd.getHistory(username);
	}
	
		
	

}
