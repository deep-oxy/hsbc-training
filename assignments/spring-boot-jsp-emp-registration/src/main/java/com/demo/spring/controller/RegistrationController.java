package com.demo.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Emp;

@Controller
public class RegistrationController {

	@RequestMapping(path = "/reg", method = RequestMethod.GET)
	public String getLoginPage() {
		return "reg";
	}

//	@RequestMapping(path = "/reg", method = RequestMethod.POST)
//	public ModelAndView processLogin(@RequestParam("id") int id, @RequestParam("name") String name,
//			@RequestParam("location") String location, @RequestParam("salary") double salary) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("success");
//		HashMap<String, String> data = new HashMap<>();
//		data.put("id", id + "");
//		data.put("name", name);
//		data.put("location", location);
//		data.put("salary", salary + "");
//		mv.addObject("data", data);
//		return mv;
//	}

	@RequestMapping(path = "/reg", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView processLogin(Emp e) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");

		mv.addObject("data", e);
		return mv;
	}

}
