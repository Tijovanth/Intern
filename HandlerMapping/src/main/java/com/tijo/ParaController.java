package com.tijo;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class ParaController extends ParameterizableViewController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		mv.setViewName(getViewName());
		HashMap<String,String> map = new HashMap<>();
		map.put("name",name);
		mv.addObject("map",map);
		return mv;
	}
}
