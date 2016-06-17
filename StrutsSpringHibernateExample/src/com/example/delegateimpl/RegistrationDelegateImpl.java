package com.example.delegateimpl;

import java.util.List;


import com.example.delegate.RegistrationDelegate;
import com.example.dto.RegistrationDto;
import com.example.service.RegistrationService;

public class RegistrationDelegateImpl implements RegistrationDelegate{
	
	private RegistrationService registrationService;
	

	/**
	 * @param registrationService the registrationService to set
	 */
	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	public List processLogin(String userName,String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public String processRegistration(RegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		String status = null;
		try {
			status=registrationService.processRegistration(registrationDto);
		} catch (Exception e) {
			// throw custom exception here
			e.printStackTrace();
		}
		return status;
	}
	
	

}
