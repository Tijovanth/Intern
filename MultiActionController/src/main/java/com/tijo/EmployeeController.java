package com.tijo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@SuppressWarnings("deprecation")
public class EmployeeController extends MultiActionController{

	public ModelAndView save(HttpServletRequest req, HttpServletResponse res)
	{
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Success.jsp");
		mv.addObject("uname", uname);
		mv.addObject("pass", pass);
		return mv;
	}
	
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res)
	{
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Success.jsp");
		mv.addObject("name", name);
		mv.addObject("id", id);
		return mv;
	}
}
