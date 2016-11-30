package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.RegistrationBean;
import com.validator.RegistrationValidator;

@Controller
@RequestMapping(value="/registration.htm")
public class RegistrationController {
	RegistrationValidator validator = null;
	
	public RegistrationValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(RegistrationValidator validator) {
		this.validator = validator;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		RegistrationBean userRegis = new RegistrationBean();
		model.addAttribute("Registration", userRegis);
		return "registration";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@ModelAttribute(value="Registration") @Valid RegistrationBean userRegis,BindingResult result){
		validator.validate(userRegis, result);
		if(result.hasErrors()){
			return "registration";
		}else{
			return "success";
		}		
	}
}
