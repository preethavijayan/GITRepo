package com.example.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.MappingDispatchActionSupport;

import com.example.delegate.RegistrationDelegate;
import com.example.dto.LoginDto;
import com.example.dto.RegistrationDto;
import com.example.form.RegistrationForm;




public class RegistrationAction extends MappingDispatchActionSupport{
	
	private RegistrationDelegate registrationDelegate;
	
	public ActionForward registerAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
			String status=null;
			RegistrationDto registrationDto= new RegistrationDto();
			LoginDto loginDto = new LoginDto();
			System.out.println("Inside register action");
			RegistrationForm registrationForm=(RegistrationForm)form;
			System.out.println(registrationForm.getAddress());
			//setting the dto
			registrationDto.setAddress(registrationForm.getAddress());
			registrationDto.setName(registrationForm.getName());
			registrationDto.setCity(registrationForm.getCity());
			registrationDto.setState(registrationForm.getState());
			registrationDto.setCountry(registrationForm.getCountry());
			registrationDto.setAddress(registrationForm.getAddress());
			registrationDto.setPinCode(registrationForm.getPinCode());
			
			loginDto.setUserName(registrationForm.getUserName());
			loginDto.setPassword(registrationForm.getPassword());
			loginDto.setRegistrationDto(registrationDto);
			registrationDto.setLoginDto(loginDto);
			
			//calling delegate
			status=registrationDelegate.processRegistration(registrationDto);
			
			
			return mapping.findForward(status);
	
	}
	
	

	public ActionForward loginAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
			System.out.println("Inside login action");
			RegistrationForm registrationForm=(RegistrationForm)form;
			System.out.println(registrationForm.getUserName());
				return mapping.findForward(null);
	
	}
	
	/**
	 * @param registrationDelegate the registrationDelegate to set
	 */
	public void setRegistrationDelegate(RegistrationDelegate registrationDelegate) {
		this.registrationDelegate = registrationDelegate;
	}
	

}
