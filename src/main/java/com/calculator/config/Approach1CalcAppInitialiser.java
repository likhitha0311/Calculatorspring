package com.calculator.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//This is approach one for confiuring dispatcher servlet.
//When this file is on, u can ignore CalculatorApplicationInitialiser class.
public class Approach1CalcAppInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//this is class array
		
		Class arr[] = {CalculatorAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] ={"/mywebsite.com/*"};
		return null;
	}

}
