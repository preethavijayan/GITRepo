package com.example.delegate;

import java.util.List;

import com.example.dto.RegistrationDto;

public interface RegistrationDelegate {
	
	public String processRegistration(RegistrationDto registrationDto);
	public List processLogin(String userName,String password);

}
