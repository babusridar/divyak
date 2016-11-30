package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.model.Cart;
import com.model.Order;
import com.model.ProductModel;
import com.service.Cartservice;
import com.service.ProductService;

@Controller
public class CartController {

	@Autowired
	ProductService ps;

	@Autowired
	Cartservice cs;

	@Autowired
	ProductController prdcntrl;

	public String username;

	@ModelAttribute
	public void getuserdata(HttpServletRequest req) {
		Authentication au = SecurityContextHolder.getContext().getAuthentication();
		String name = au.getName();

		HttpSession ses = req.getSession();
		ses.setAttribute("u", name);
		username = (String) ses.getAttribute("u");
		System.out.println((String) ses.getAttribute("u"));

	}

	public String onnumilla() {
		System.out.println("reterieve" + username);
		return username;
	}

	@RequestMapping(value = "/user/addtocart/{productid}")
	public String add(@PathVariable("productid") int id) {
		Cart cart = new Cart();
		ProductModel pm = ps.getProductModel(id);
		List<Cart> allCart = (List<Cart>) cs.getAllCart(username);
		List<Cart> p = allCart;
		System.out.println("ADDTOCART" + username);
		System.out.println(id);
		for (int i = 0; i < p.size(); i++) {
			System.out.println("pakka");
			int pid = p.get(i).getProduct().getProductid();
			System.out.println(pid);
			System.out.println(id);
			if (pid==id) {
				System.out.println("Existing avaiable loop");
				int quan = p.get(i).getQuantity() + 1;
				prdcntrl.deleteproductquantity(id);
				p.get(i).setQuantity(quan);
				p.get(i).setTotalprice(p.get(i).getProduct().getPrice() * quan);
				System.out.println("update");
				cs.update(p.get(i));
				return "redirect:/viewcart";
			}
		}
		System.out.println("newproduct");
		cart.setQuantity(1);
		prdcntrl.deleteproductquantity(id);
		cart.setTotalprice(pm.getPrice());
		cart.setProduct(pm);
		cart.setUsername(username);
		cs.add(cart);

		return "redirect:/viewcart";
	}

	@RequestMapping(value = "/viewcart")
	public String cart(Map<String, Object> map, Cart cart) {

		map.put("cart", cart);
		map.put("cartlist", cs.getAllCart(username));

		return "Cart";
	}

	@RequestMapping(value = "/viewcartpdetails")
	public @ResponseBody List<Cart> getall() {
		List<Cart> cart = null;
		try {
			cart = cs.getAllCart(username);
			System.out.println(username);
		} catch (Exception e) {
			cart = null;
		}
		System.out.println(cart);
		return cart;

	}

	@RequestMapping(value = "/delete/cartitem/{cid}")
	public String deleteaction(@PathVariable("cid") int cid) {
		Cart cart=cs.getcartitembyid(cid);
		int productid=cart.getProduct().getProductid();
		int cartquantity=cart.getQuantity();
		System.out.println(cartquantity);
		System.out.println("DELETECRT");
		cs.deletecartitem(cid);
		prdcntrl.addproctquantity(productid,cartquantity);
		return "redirect:/viewcart";
	}
	@RequestMapping(value="/yourorders")
	public String Histoy(Map<String, Object> map)
	{
	System.out.println("history"+username);	
	List<Order> history=cs.getHistory(username);
	Order ord=new Order();
	map.put("ORDERS", ord);
	map.put("OrderList",history);
	return "Histoyoforders";
	}
	@RequestMapping(value="delallcart")
	public String delteallcart()
	{
		System.out.println("DELTEBYMANUAL"+username);
		List<Cart> decart=cs.getAllCart(username);
		
		for(int i=0;i<decart.size();i++)
		{
			int getprdit=decart.get(i).getProduct().getProductid();
			int delquan=decart.get(i).getQuantity();
			prdcntrl.addproctquantity(getprdit,delquan);	
		}
		cs.deleteallcartitem(username);
		return "redirect:/viewcart";
	}
}