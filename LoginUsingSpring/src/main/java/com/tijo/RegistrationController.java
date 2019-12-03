package com.tijo;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
   
	HashMap<String,User> Data = new HashMap<>();
	@RequestMapping("/Registration")
	public ModelAndView login(@RequestParam("uname") String name, @RequestParam("pwd") String pass)
	{
		ModelAndView mv = new ModelAndView();
		if(!Data.containsKey(name))
		{
			Data.put(name, new User(name,pass));
			mv.setViewName("index");
			
		}else
		{
		  mv.setViewName("Registration");
		  mv.addObject("Message", "Username is already present!");
		}	
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView registration(@RequestParam("uname") String name, @RequestParam("pwd") String pass)
	{
		ModelAndView mv = new ModelAndView();
		if(Data.containsKey(name))
		{
			User temp = Data.get(name);
			if(temp.getPassword().equals(pass))				
			{
				mv.setViewName("Display");
				mv.addObject("Message", "Login Success");
			}else
			{
				mv.setViewName("index");
				mv.addObject("Message", "Password Invalid");
			}
		}else
		{
			mv.setViewName("index");
			mv.addObject("Message","Username Invalid");
		}
		return mv;
	}
	
	@RequestMapping("/Register")
	public ModelAndView register()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Registration");
		return mv;
	}
}
