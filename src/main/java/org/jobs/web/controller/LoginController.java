package org.jobs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login.do")
	public ModelAndView login(){
		ModelAndView view = new ModelAndView("main");
		return view;
	}
}
