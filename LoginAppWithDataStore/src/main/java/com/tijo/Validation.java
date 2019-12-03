package com.tijo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Validation {
	
	@Autowired HttpSession session;
	
	DataStore datastore = new DataStore();
	
	@RequestMapping(value="/Registration")
	public ModelAndView Registration(@RequestParam("uname") String name,@RequestParam("pwd") String pass)
	{
		ModelAndView mv = new ModelAndView();
		if(!datastore.check(name, pass))
		{
			datastore.register(name, pass);
			session.setAttribute("Username", name);
			mv.setViewName("redirect:/Login.jsp");
		}
		else
		{
			mv.setViewName("Registration");
			mv.addObject("message","Username is already defined");
		}
		return mv;
	}
	@RequestMapping(value="/Login")
	public ModelAndView Login(@RequestParam("uname") String name,@RequestParam("pwd") String pass)
	{
		ModelAndView mv = new ModelAndView();
		if(datastore.logincheck(name, pass))
		{
			mv.setViewName("redirect:/Home.jsp");
		}else
		{
			mv.setViewName("Login");
			mv.addObject("message","Username or Password Invalid");
		}
		return mv;
	} 
	@RequestMapping(value="/Delete")
	public ModelAndView Delete()
	{
		ModelAndView mv = new ModelAndView();
		String name = (String) session.getAttribute("Username");
		datastore.delete(name);
		mv.setViewName("redirect:/Login.jsp");
		return mv;
	}
	@RequestMapping(value="/Update")
	public ModelAndView Update(@RequestParam("uname") String name,@RequestParam("pwd") String pass)
	{
		ModelAndView mv = new ModelAndView();
		String currentName = (String) session.getAttribute("Username");
		System.out.println(currentName);
		datastore.update(currentName, name, pass);
		mv.setViewName("redirect:/Home.jsp");
		 return mv;
	}
}
