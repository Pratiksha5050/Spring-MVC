package controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController 
{
	@RequestMapping("/welcome")
	public String printMessage(Model model)
	{
		//System.out.println("Welcome to Spring MVC");
		model.addAttribute("welcome","Welcome to Spring MVC");
		return "message";
	}
}
