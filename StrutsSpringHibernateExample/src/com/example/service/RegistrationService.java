package com.example.service;

import java.util.List;

import com.example.dto.RegistrationDto;

public interface RegistrationService {
	
	public String processRegistration(RegistrationDto registrationDto);
	public List processLogin(String userName,String password);

}
