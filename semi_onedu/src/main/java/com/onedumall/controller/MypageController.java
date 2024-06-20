package com.onedumall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {

	@GetMapping("/")
	public String infoChange() {
		return "index";
	}
	
}
