package com.simple.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.service.PersonService;

@Controller
public class PersonController {

	@Resource
	private PersonService service;

	@RequestMapping(value="/person")
	public String person(HttpServletRequest request, Model model) throws Exception{
		String searchName = request.getParameter("searchName");
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("searchName", searchName);
		
		List<Map<String, Object>> list = service.personList(params);
		
		model.addAttribute("list", list);
		model.addAttribute("searchName", searchName);
		return "person";
	}
}
