package com.example.dao;

import java.util.List;

import com.example.dto.RegistrationDto;

public interface RegistrationDao {
	
	public String processRegistration(RegistrationDto registrationDto);
	public List processLogin(String userName,String password);

}
