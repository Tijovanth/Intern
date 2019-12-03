package com.tijo;


import java.util.ArrayList;
import java.util.HashMap;

//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class JsonController {

//	@RequestMapping(value="/sample.ds", method=RequestMethod.GET, produces = "application/json")
//	public ModelAndView sample()
//	{
//		Employee e = new Employee("Tijo","113");
//		Employee e1 = new Employee("Kama","1232");
//		Employee e2 = new Employee("Ajay","12");
//		ArrayList<Employee> list = new ArrayList<>();
//		list.add(e);
//		list.add(e1);
//		list.add(e2);
//		HttpHeaders httpHeaders= new HttpHeaders();
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		ResponseEntity<ArrayList<Employee>> res = new ResponseEntity<>(list, httpHeaders, HttpStatus.OK);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("index.jsp");
//		mv.addObject("json", res);
//		return mv;
//	}
	
	@RequestMapping(value="/sample.ds",method=RequestMethod.GET, produces = "application/json")
	public ModelAndView sample()
	{
		Employee e = new Employee("Tijo","113");
		Employee e1 = new Employee("Kama","1232");
		Employee e2 = new Employee("Ajay","12");
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		HashMap<String,String> map = new HashMap<>();
		map.put("Name", "Tijo");
		map.put("Password","ojit");
		Gson gson = new Gson();
		String json = gson.toJson(list);
		String mapJson = gson.toJson(map);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("json", json);
		mv.addObject("map", mapJson);
		return mv;
	}
}
