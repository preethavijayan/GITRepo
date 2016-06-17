package com.example.form;


import org.apache.struts.validator.ValidatorActionForm;

public class RegistrationForm extends ValidatorActionForm{

	private String name;
	private String address;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	private String userName;
	private String password;
	private String flagSuccess;
	private String flagError;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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
	 * @return the flagSuccess
	 */
	public String getFlagSuccess() {
		return flagSuccess;
	}
	/**
	 * @param flagSuccess the flagSuccess to set
	 */
	public void setFlagSuccess(String flagSuccess) {
		this.flagSuccess = flagSuccess;
	}
	/**
	 * @return the flagError
	 */
	public String getFlagError() {
		return flagError;
	}
	/**
	 * @param flagError the flagError to set
	 */
	public void setFlagError(String flagError) {
		this.flagError = flagError;
	}
	
	
}
