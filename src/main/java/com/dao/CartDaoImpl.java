package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Cart;
import com.model.Cartuser;
import com.model.Newuser;
import com.model.Order;
import com.model.Shipping;

@Repository
@Transactional
public class CartDaoImpl  implements Cartdao{

	@Autowired
	private SessionFactory sf;

	@Override
	public void add(Cart cart) {
		

	/*	List<Newuser> userdet=sf.getCurrentSession().createQuery("from USER where username='"+username+"'").list();
	for(int i=0;i<userdet.size();i++)
	{
		Newuser nw=(Newuser) userdet.get(i);
		nw.setCart(cart);
	}*/
	sf.getCurrentSession().save(cart);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cart> getAllCart(String username)
	{	
		System.out.println("getllvart"+username);
		return sf.getCurrentSession().createQuery("from CART where USERNAME='"+username+"'").list();
	}

	/*@Override
	public void odadd(Shipping sh) {
		sf.getCurrentSession().save(sh);	


	}*/

	@Override
	public void addbuy(Cartuser cud, String username) {
			sf.getCurrentSession().save(cud);
	}


	@Override
	public void saveshipment(Shipping shippingdetails,String username) {
		System.out.println("Shipping"+username);
		String mail=null;
		@SuppressWarnings({ "unchecked" })
		List<Newuser> newuser=sf.getCurrentSession().createQuery("from USER where username='"+username+"'").list();
	
		for(Newuser n:newuser)
		{
			mail=n.getEmail();
		}
		System.out.println(mail);
		shippingdetails.setMailId(mail);
		sf.getCurrentSession().save(shippingdetails);	
		
	}
	@Override
	public Cartuser getdetails(int sid)
	{
	return (Cartuser)sf.getCurrentSession().get(Cartuser.class,sid);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Cartuser> getCartforuser(int sid) {
	
		return (List<Cartuser>) sf.getCurrentSession().createQuery("from SHIPPEDCART where SHIPPINGDETAILS_SID='"+sid+"'").list();
	}


	@Override
	public void saveorder(Order order) {
		
		sf.getCurrentSession().saveOrUpdate(order);
	}

	@Override
	public void update(Cart cart) {
		
		sf.getCurrentSession().update(cart);
	}
	
	
	@Override
	public void deletecartitem(int cid) {
		// Query for deleting cart items with the getting cart id value
		sf.getCurrentSession().delete(getCartdetbycid(cid));
	}

	@Override
	public void deleteallcartitem(String username) {
		// Query for deleting all cart items for current user 
		System.out.println("username");
		sf.getCurrentSession().createQuery("delete from CART where username='"+username+"'").executeUpdate();
	}

	@Override
	public Cart getCartdetbycid(int cid) {
		System.out.println("CARTPOINT"+(Cart)sf.getCurrentSession().get(Cart.class, cid));
		return (Cart)sf.getCurrentSession().get(Cart.class,cid);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> getHistory(String username) {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from FINALTBL where USERNAME='"+username+"'").list();
	}
}
