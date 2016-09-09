package com.logindao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

@Repository
public class LoginDAO 
{ 
	public static boolean submit(String user, String password, ModelMap m)
	{
		if(user.equals("amar@gmail.com") && password.equals("12345"))
		{
			m.addAttribute("user",user);
		}
		else
		{
			m.addAttribute("errormsg", "User name and password does not match");
}
		return false;
}
}
	