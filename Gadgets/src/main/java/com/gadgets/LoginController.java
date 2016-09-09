package com.gadgets;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController{

@RequestMapping(value="/",method=RequestMethod.GET)
	public String showLogin()
	{
		return "Login";
		}
	
	@RequestMapping(value="/submit", method = RequestMethod.GET)
	public Boolean showsuccess()
	{
		Object password = null;
		Object email = null;
		if(email.equals("amar@gmail.com") && password.equals("12345"))
		{	
		return true;
		}
		else
		{
			return false;
			
		}
		}
}