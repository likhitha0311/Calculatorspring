package com.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.api.UserInfoDTO;
import com.calculator.api.UserInfoDTO2;

@Controller
public class Homepagecontroller2 
{
@RequestMapping("/showpage")
	public String showHomePage(UserInfoDTO2 userInfoDTO2,Model model) 
    {
	//If i want to show default values in the text box ie:Mr X and Ms Y, I can try this.When the page loads, text box should have X and Y.
	//however in input tag we cannot add the variables, it will appear outside the text box, so better to switch to form tags
	//of spring and use model attribute
	model.addAttribute("username",userInfoDTO2.getUsername());
	model.addAttribute("friendname",userInfoDTO2.getFriendname());
		return "home-page-2";
	}


@RequestMapping("/process-homepage2")
public String processHomePage(UserInfoDTO2 userInfoDTO2,Model model) 
{
	
	model.addAttribute("username",userInfoDTO2.getUsername());
	model.addAttribute("friendname",userInfoDTO2.getFriendname());
	return "result-page-2";
}
}
