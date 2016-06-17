package com.example.daoimpl;

import java.util.List;

import com.example.base.daoimpl.BaseDaoImpl;
import com.example.dao.RegistrationDao;
import com.example.dto.RegistrationDto;

public class RegistrationDaoImpl extends BaseDaoImpl implements RegistrationDao{

	public List processLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public String processRegistration(RegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		Object obj= null;
		String status= null;
		obj=super.save(registrationDto);
		if(obj!=null){
			status="success";
		}else{
			status="failure";
		}
		return status;
	}

	

}
