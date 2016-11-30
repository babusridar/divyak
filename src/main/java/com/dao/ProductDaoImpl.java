package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Order;
import com.model.ProductModel;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
@Autowired
private SessionFactory session;
	
	@Override
	public void add(ProductModel productModel) {
		session.getCurrentSession().save(productModel);
	}

	@Override
	public void edit(ProductModel productModel) {
		session.getCurrentSession().update(productModel);
		
	}

	@Override
	public void delete(int getId) {
		session.getCurrentSession().delete(getProductModel(getId));
	}

	@Override
	public ProductModel getProductModel(int getId) {
		return (ProductModel)session.getCurrentSession().get(ProductModel.class,getId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllProductModel() {
		return session.getCurrentSession().createQuery("from PRODUPD").list();
	}

/*	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllHeadPhones() {
		
		return session.getCurrentSession().createQuery("from PRODUPD where category='Headphones'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllCases() {
		
		return session.getCurrentSession().createQuery("from PRODUPD where category='Cases'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllChargers() {
				return session.getCurrentSession().createQuery("from PRODUPD where category='Chargers'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllScreenGuard() {
		
		return session.getCurrentSession().createQuery("from PRODUPD where category='Screenguards'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllCables() {
		
		return session.getCurrentSession().createQuery("from PRODUPD where category='Cables'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllStorge() {
		
		return session.getCurrentSession().createQuery("from PRODUPD where category='Storage'").list();
	}
*/
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductModel> getAllCaregory(String Category) {
		
		return session.getCurrentSession().createQuery("from PRODUPD where category='"+Category+"'").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> getalloderds() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from FINALTBL").list();
	}
}
