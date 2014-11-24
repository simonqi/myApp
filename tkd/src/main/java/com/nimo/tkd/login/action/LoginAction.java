package com.nimo.tkd.login.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginAction {

	@RequestMapping("getLoginInfo")
	public String getLoginInfo(){
		System.out.println("===========hehe=================");
		return "/index";
	}
	
	
}
