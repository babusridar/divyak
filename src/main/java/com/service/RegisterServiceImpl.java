package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RegisterDAO;
import com.model.Newuser;



@Service
@Transactional
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	RegisterDAO registerDAO;
	
	

	@Override
	public void s(Newuser newuser) {
		// TODO Auto-generated method stub
		registerDAO.sa(newuser);
	}



	@Override
	public List<Newuser> getuser() {
		// TODO Auto-generated method stub
		return registerDAO.getUsername();
	}

}