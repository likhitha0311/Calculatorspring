package com.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{
@ResponseBody
@RequestMapping("/test")
public String sayHello()
{
	
	return "first-file";
}
}
