package com.tijo;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Validation")
public class ValidationController {

	@Autowired
	ServletContext context;
	
	@PostConstruct
	public void init()
	{
	HashMap<String,Students> map = new HashMap<>();
	context.setAttribute("map", map);
	}
	
	@RequestMapping(value="/UserName.ds",method=RequestMethod.GET)
	@ResponseBody
	public String UserNameValidation(@RequestParam("enteredValue") String name)
	{
		HashMap<String,Students> map = (HashMap<String,Students>)context.getAttribute("map");
		if(map.containsKey(name))
		{
			return "Username is already Defined";
		}
		return null;
	}
	
	@RequestMapping(value="/save.ds",method=RequestMethod.POST)
	public ModelAndView Save(@RequestParam("uname")String uname,@RequestParam("email")String email,
			@RequestParam("phone")String phone,@RequestParam("address")String address,
			@RequestParam("pwd")String pass)
	{
		HashMap<String,Students> map = (HashMap<String,Students>)context.getAttribute("map");
		map.put(uname, new Students(uname,email,phone,address,pass));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Login.jsp");
		return mv;
	}
	
	@RequestMapping(value="/login.ds",method=RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest req,HttpServletResponse res)
	{
		HashMap<String,Students> map = (HashMap<String,Students>)context.getAttribute("map");
		String name = req.getParameter("uname");
		String pass = req.getParameter("pwd");
		ModelAndView mv = new ModelAndView();
		if(map.containsKey(name))
		{
			if(map.get(name).getPassword().equals(pass))
			{
				 HttpSession session = req.getSession();
				 session.setAttribute("username", name);
				 mv.setViewName("redirect:/Home.jsp");
			}
			else
			{
				mv.setViewName("redirect:/Login.jsp");
				mv.addObject("message","Password is Invalid");
			}
		}else
		{
			mv.setViewName("redirect:/Login.jsp");
			mv.addObject("message","Username is invalid");
		}
		return mv;
	}
	@RequestMapping(value="/Results.ds")
	public ModelAndView viewResults(HttpServletRequest request,HttpServletResponse response)
	{
		String name = (String) request.getSession().getAttribute("username");
		HashMap<String,Students> map = (HashMap<String,Students>)context.getAttribute("map");
		System.out.println(map.get(name));
		ArrayList<Integer> marks = map.get(name).getMarks();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Result.jsp");
		if(marks != null)
		{
		System.out.println(marks.get(0));
		mv.addObject("Mathematics", marks.get(0));
		mv.addObject("OperatingSystem", marks.get(1));
		mv.addObject("DesignAndAlgorithm", marks.get(2));
		mv.addObject("WebTechnology", marks.get(3));
		mv.addObject("DataStructure", marks.get(4));
		}else{
			mv.addObject("marks","No Marks to Display");
		}
		return mv;
	}
	@RequestMapping(value="*/admin.ds")
	public ModelAndView admin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Admin.jsp");
		return mv;
	}
	@RequestMapping(value="/marks.ds")
	public ModelAndView enterMarks(@RequestParam("name")String name)
	{
		HashMap<String,Students> map = (HashMap<String,Students>)context.getAttribute("map");
		ModelAndView mv = new ModelAndView();
		if(map.containsKey(name))
		{
			mv.setViewName("redirect:/EnterMark.jsp");
			mv.addObject("StudentName",name);
		}else
		{
			mv.setViewName("redirect:/Admin.jsp");
			mv.addObject("message", "Invalid UserName");
		}
		return mv;
	}
	@RequestMapping(value="/saveMarks.ds")
	public ModelAndView saveMarks(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		int maths = Integer.parseInt(request.getParameter("maths"));
		int os = Integer.parseInt(request.getParameter("os"));
		int da = Integer.parseInt(request.getParameter("da"));
		int web = Integer.parseInt(request.getParameter("web"));
		int ds = Integer.parseInt(request.getParameter("ds"));
		HashMap<String,Students> map = (HashMap<String,Students>)context.getAttribute("map");
		Students temp = map.get(name);
		ArrayList<Integer> marks = new ArrayList<>();
			marks.add(0,maths);
			marks.add(1,os);
			marks.add(2,da);
			marks.add(3,web);
			marks.add(4,ds);
			temp.setMarks(marks);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Admin.jsp");
		mv.addObject("message", "SuccessFully Registered");
		return mv;
	}
	@RequestMapping(value="/Logout.ds")
	public ModelAndView Logout(HttpServletRequest req,HttpServletResponse res)
	{
		req.getSession().invalidate();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Login.jsp");
		return mv;
	}
}
