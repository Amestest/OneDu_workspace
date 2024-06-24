package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.MyInfo;
import com.onedumall.service.MyInfoService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MypageMainController {
	@Autowired
	private MyInfoService myinfoService;

	
	@GetMapping("/info")
	public String getAllmember(Model model) {
		List<MyInfo> infoList = myinfoService.getAllmember();
		log.info("infoList : " + infoList);
		model.addAttribute("infoList",infoList);
		return "mypage_info";
	}

	@GetMapping("/infoChange")
	public String MyChangeInfo(Model model) {
		return "mypage_infoChange";
	}
	
	@GetMapping("/pwChange")
	public String MyPwChange(Model model) {
		return "mypage_pwChange";
	}
	
	@GetMapping("/userDelete")
	public String MyUserDelete(Model model) {
		return "mypage_userDelete";
	}

	
}
