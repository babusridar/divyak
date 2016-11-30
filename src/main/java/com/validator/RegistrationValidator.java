package com.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class RegistrationValidator implements Validator {

	@Override
	public boolean supports(Class<?> c) {
		return RegistrationBean.class.isAssignableFrom(c);
	}

	@Override
	public void validate(Object command, Errors errors) {
		RegistrationBean regBean = (RegistrationBean)command;
		if(!regBean.getPassword().equals(regBean.getRePassword()))
			errors.rejectValue("rePassword","password.notmatch");
	}

}
