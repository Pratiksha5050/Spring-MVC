package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LoginBean;

//the business logic resides within the service layer so we use the @Service Annotation to indicate that a class belongs to that layer.
@Service
public class LoginService {	

	public boolean validate(LoginBean bean)	{
		if(bean.getPassword().equals(bean.getUserName()))
		{
			return true;
		}
		return false;
	}
	

}
