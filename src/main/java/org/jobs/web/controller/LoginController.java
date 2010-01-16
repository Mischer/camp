package org.jobs.web.controller;

import org.jobs.ws.bean.UsersManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("login")
public class LoginController {

	@Autowired
	UsersManager usersManager;
		
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView view = new ModelAndView("login");
		return view;
	}

	@RequestMapping("/main")
	public ModelAndView main() {
		ModelAndView view = new ModelAndView("main");
		return view;
	}

}