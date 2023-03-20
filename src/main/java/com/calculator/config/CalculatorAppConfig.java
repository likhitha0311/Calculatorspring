package com.calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//this is a replacement for application-config.xml or dispatchername-servlet.xml

@EnableWebMvc
@Configuration
@ComponentScan(basePackages ="com.calculator.controllers")
public class CalculatorAppConfig 
{
//set view resolver
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
}
