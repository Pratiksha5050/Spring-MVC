package com.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.model.HelperBean;

@Service
public class HelperService {
	public double calculateTotalCost(HelperBean helperBean) {
		Map<String, Integer> m = new HashMap<>();
		m.put("ACService", 400);
		m.put("WashingMachineService", 500);
		m.put("RefrigeratorService", 300);
		String ser = helperBean.getServiceType();
		double totalCost = m.get(ser) * helperBean.getNoOfHours();
		return totalCost;
	}

}
