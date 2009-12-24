package org.jobs.web.controller;

import org.jobs.ws.bean.ProcessManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("order")
public class OrderController {

	@Autowired
	ProcessManager processManager;

	@RequestMapping("/order/list")
	public ModelAndView list() {
		ModelAndView view = new ModelAndView("order/list");
		return view;
	}

	@RequestMapping(value = "/order/edit", method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam(value = "id", required = true) long id) {
		ModelAndView view = new ModelAndView("order/edit");
		view.addObject("order", processManager.getOrder(id));
		return view;
	}

	@RequestMapping("/order/view")
	public ModelAndView view() {
		ModelAndView view = new ModelAndView("order/edit");
		return view;
	}
}
