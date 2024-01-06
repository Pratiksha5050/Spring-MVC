package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 

public class SimpleInterestController {

	@RequestMapping(value = "/SIcalculator", method = RequestMethod.GET)
	// `Model` is used to pass data between controllers and views
    public String showForm(Model model) {
        model.addAttribute("simpleInterest", new SIMainClass());
        return "SimpleInterest";
    }

    @RequestMapping(value = "/SIcalculator", method = RequestMethod.POST)
    public String calculateInterest(SIMainClass simpleInterest, Model model) 
    {
        double interest = (simpleInterest.getPrincipal() * simpleInterest.getRate() * simpleInterest.getYear()) / 100;
        simpleInterest.setInterest(interest);
        model.addAttribute("si",simpleInterest);
        return "result";
    }
}
