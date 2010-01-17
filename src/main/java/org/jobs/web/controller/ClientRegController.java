package org.jobs.web.controller;



import org.jobs.persistence.bean.Client;
import org.jobs.persistence.bean.Order;
import org.jobs.ws.bean.ProcessManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("clientForm")

public class ClientRegController {
	
	@Autowired
	private ProcessManager processManager;
	
/*	
    private ClientRegController(ProcessManager processManager){
    	 this.processManager = processManager;
     }*/
	
	@ModelAttribute("clientForm")
	public Client getClientForm(){
		return new Client();
	} 
	
	@RequestMapping("/registration/registrationView")
	public ModelAndView registration() {
		ModelAndView view = new ModelAndView("registration");
		/*view.setViewName("clients");*/
		view.addObject("clients", processManager.findClientByFirstName("aaa"));
		return view;
	}
	
	/*@RequestMapping("/registration/registrationClient")
	public ModelAndView registrationClient() {
		ModelAndView view = new ModelAndView("/registration/registrationClient");
		return view;
	}*/
	@RequestMapping(value = "/registration/registrationView", method = RequestMethod.POST)
    public String post(@ModelAttribute("clientForm") Client client1, BindingResult result) {
        //validator.validate(client1, result);
       /* if (result.hasErrors()) {
            return "client1";
        }*/
		System.out.println("---NEW CLIENT----" + client1.getFirstName());
		Client client = processManager.createClient(client1);
		return  "login";
		}  
    
}
	
	

