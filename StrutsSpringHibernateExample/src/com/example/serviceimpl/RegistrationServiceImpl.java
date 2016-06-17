package com.example.serviceimpl;

import java.util.List;

import com.example.dao.RegistrationDao;
import com.example.dto.RegistrationDto;
import com.example.service.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService{
	
	private RegistrationDao registrationDao;

	
	/**
	 * @param registrationDao the registrationDao to set
	 */
	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}

	public List processLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public String processRegistration(RegistrationDto registrationDto) {
		
		return registrationDao.processRegistration(registrationDto);
	}

	

}
