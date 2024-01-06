package component;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public String showLogin(Model m)
	{
		return "login";
	}
	
	
	@RequestMapping(value="/processform" , method=RequestMethod.POST)
	public String login(@ModelAttribute("user")User user,Model m)
	{
		if(user.getUsername()!=null && !user.getUsername().isEmpty() && user.getEmail()!=null && !user.getEmail().isEmpty())
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
}
