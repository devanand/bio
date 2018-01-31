package com.bio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public ModelAndView showMessage() 
	{
		System.out.println("in controller");
 
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}
