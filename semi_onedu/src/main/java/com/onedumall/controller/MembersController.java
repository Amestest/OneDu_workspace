package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.Members;

import com.onedumall.service.RegisterService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class MembersController {
	
	@Autowired
	private RegisterService registerService;
	
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
	
	
	@PostMapping("/register")
	public String insertRegister(Members members, Model model) {
		log.info("1"+members.getMembers_pw());
		registerService.insertRegister(members);
		log.info("2");
		model.addAttribute("msg","회원가입이 성공적으로 완료됐습니다.");		
		return "main";
		
	}
	
	
}
