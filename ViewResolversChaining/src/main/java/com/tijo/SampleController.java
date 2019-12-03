package com.tijo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value="/sample.ds")
	public ModelAndView sample()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Sample1");
		return mv;
	}
}
