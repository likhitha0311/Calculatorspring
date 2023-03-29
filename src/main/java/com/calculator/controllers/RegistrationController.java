package com.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calculator.api.RegistrationPageDTO;

@Controller
public class RegistrationController 
{

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") RegistrationPageDTO dto) 
	{
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processRegistrationPage(@ModelAttribute("userReg") RegistrationPageDTO registrationPageDTO) 
	{
		return "user-registration-success";
	}
}
