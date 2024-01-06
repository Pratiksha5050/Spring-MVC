package component;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("/index")
	public String home()
	{
		//System.out.println("This is home url");
		return "index";
	}  
	
	@RequestMapping("/hello")
	public String HelloWorldS()
	{
		return "HelloWorld";
	}
}
