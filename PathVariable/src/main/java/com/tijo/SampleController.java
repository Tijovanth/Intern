package com.tijo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value="{id}/sample.ds")
	public ModelAndView sample(@PathVariable String id)
	{
		id = id + 1;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Another");
		mv.addObject("id", id);
	    return mv;
	}
}
