package com.example.dto;

public class LoginDto {
	
	private Long loginId;
	private String userName;
	private String password;
	private RegistrationDto registrationDto;
	/**
	 * @return the loginId
	 */
	public Long getLoginId() {
		return loginId;
	}
	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the registrationDto
	 */
	public RegistrationDto getRegistrationDto() {
		return registrationDto;
	}
	/**
	 * @param registrationDto the registrationDto to set
	 */
	public void setRegistrationDto(RegistrationDto registrationDto) {
		this.registrationDto = registrationDto;
	}
	
	

}
