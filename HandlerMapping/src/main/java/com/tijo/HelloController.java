package com.tijo;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
//import org.springframework.web.servlet.mvc.Controller;

public class HelloController extends AbstractController{

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
//		
//		String name = req.getParameter("name");
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("success");
//		HashMap<String,String> map = new HashMap<>();
//		map.put("name",name);
//		mv.addObject("map",map);
//		return mv;
//		
//	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		HashMap<String,String> map = new HashMap<>();
		map.put("name",name);
		map.put("password","123456");
		mv.addObject("map",map);
		return mv;
	}

}
