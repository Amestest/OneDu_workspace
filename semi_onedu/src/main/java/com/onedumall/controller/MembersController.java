package com.onedumall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.onedumall.dto.Members;
import com.onedumall.service.RegisterService;

@Controller
public class MembersController {
	
	@GetMapping("/")
	public String mainForm(Model model) {
		
		return"main";
	}
	@GetMapping("/main")
	public String mainForm2(Model model) {
		
		return"main";
	}
	@GetMapping("/register")
	public String registerForm(Model model) {
		model.addAttribute("members", new Members());
		return "register";	
	}
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/register")
	public String insertRegister(Members members, Model model) {
		registerService.insertRegister(members);
		model.addAttribute("msg","회원가입이 성공적으로 완료됐습니다.");
		return "main";
		
	}
	
}
