package com.calculator.config;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/*
public class CalculatorApplicationInitialiser implements WebApplicationInitializer  {


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		/*If you are using application-config.xml or dispatchername-servlet.xml
//then below code is applicable
		
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		
		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		//when dispatcherservlet is initialised it will look for a file application-config.xml or dispatcher-name-servlet.xml, we are creating 
		//it here
		System.out.println("Custom web.xml");
		
		//that file is passed as an argument to DispatcherServlet 
		//while creating DispatcherServlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		//Register dispatcherServlet with servlet context
		ServletRegistration.Dynamic myCustomDispatcherServlet=servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		//load on start up that we have in xml. without this line it will not initialise.
		myCustomDispatcherServlet.setLoadOnStartup(1);
		
		//this is for url pattern
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
		
		
		
	//Below code is to register CalculatorAppConfig class(replacement for application-config.xml or dispatchername-servlet.xml)
		//with dispatcher servlet
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(CalculatorAppConfig.class);
		
       DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		//Register dispatcherServlet with servlet context
		ServletRegistration.Dynamic myCustomDispatcherServlet=servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		//load on start up that we have in xml. without this line it will not initialise.
		myCustomDispatcherServlet.setLoadOnStartup(1);
		
		//this is for url pattern
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
		
	}

}

*/