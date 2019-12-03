package com.tijo;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ValidationController {

	@Autowired
	HttpServletRequest request;
	User user = new User();
	@Autowired HttpSession session;
	UserData datastore = new UserData();
	
	@RequestMapping(value="/Login" ,method=RequestMethod.POST)
	public ModelAndView Login() throws IOException, JSONException
	{
		System.out.println("Login Ulla");
		BufferedReader reader = request.getReader();
		String loginDetails = reader.readLine();
		JSONObject jsonObject = new JSONObject(loginDetails);
		String uname = (String) jsonObject.get("uname");
		String pwd = (String) jsonObject.get("pwd");
		user.setUserName(uname);
		user.setPassword(pwd);
		ModelAndView mv = new ModelAndView();
		if(datastore.logincheck(user))
		{
			System.out.println("suc");
			mv.setViewName("redirect:/Home.jsp");
		}else
		{
			System.out.println("Eror");
			mv.setViewName("Login");
			mv.addObject("message","Username or Password Invalid");
		}
		return mv;
	}
	
	@RequestMapping(value="/Registration",method=RequestMethod.POST)
	public ModelAndView Registration() throws IOException, JSONException
	{
		BufferedReader reader = request.getReader();
		String registrationDetails = reader.readLine();
		JSONObject jsonObject = new JSONObject(registrationDetails);
		String uname = (String) jsonObject.get("uname");
		String pwd = (String) jsonObject.get("pwd");
		user.setUserName(uname);
		user.setPassword(pwd);
		ModelAndView mv = new ModelAndView();
		if(!datastore.check(user))
		{
			datastore.register(user);
			session.setAttribute("Username", uname);
			mv.setViewName("redirect:/Login.jsp");
		}
		else
		{
			mv.setViewName("Registration");
			mv.addObject("message","Username is already defined");
		}
		return mv;
	}
}


