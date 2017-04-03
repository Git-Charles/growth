package com.myssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/style_demo")
	public String style_demo(){
		return "style_demo";
	}
}
