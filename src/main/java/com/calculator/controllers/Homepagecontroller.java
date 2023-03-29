package com.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.api.UserInfoDTO;

@Controller
public class Homepagecontroller 
{
@RequestMapping("/show")
	public String showHomePage() {
		return "home-page";
	}


//public String processHomePage(@RequestParam("username") String uname,@RequestParam("friendname") String fname)
//above line is if you want to use custom names other than the names mentioned in home-page.jsp
//@RequestMapping("/process-homepage")
//public String processHomePage(@RequestParam String username,@RequestParam String friendname,Model model) 
//{
//	model.addAttribute("username",username);
//	model.addAttribute("friendname",friendname);
//	return "result-page";
//}

//@RequestMapping("/process-homepage")
//public String processHomePage(@RequestParam("username") String uname,@RequestParam("friendname") String fname,Model model) 
//{
//	
//	model.addAttribute("username",uname);
//	model.addAttribute("friendname",fname);
//	return "result-page";
//}

@RequestMapping("/process-homepage")
public String processHomePage(UserInfoDTO userInfoDTO,Model model) 
{
	
	model.addAttribute("username",userInfoDTO.getUsername());
	model.addAttribute("friendname",userInfoDTO.getFriendname());
	return "result-page";
}
}
