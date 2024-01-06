package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.HelperBean;
import com.service.HelperService;

@Controller
public class HelpController {

	@Autowired
	private HelperService helpService;

	@RequestMapping(value = "/helper", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("helper") HelperBean helperBean, BindingResult result) {
		return "showpage";

	}

	@ModelAttribute("serviceList")
	public Map<String, String> buildState() {
		Map<String,String> dp=new HashMap<>();
		dp.put("ACService", "ACService");
		dp.put("WashingMachineService", "WashingMachineService");
		dp.put("RefrigeratorService", "RefrigeratorService");
		return dp;
	}

	@RequestMapping(value="/helpdesk", method=RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("helper") HelperBean helperBean, ModelMap model, BindingResult result) {
		double tc=helpService.calculateTotalCost(helperBean);
		//helperBean.setServiceCostPerHour(tc);
		model.addAttribute("totalCost", tc);
		return "helpdesk";
	}

}
