package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khmall.dto.Members1;
import com.khmall.service.MemberService1;

import jakarta.servlet.http.HttpSession;

@Controller

public class LoginController {

    @Autowired
    private MemberService1 memberService1;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
    	model.addAttribute("m", new Members1());
    	return "login";
    	
    }
    
    @PostMapping("/login")
    public String getLogin(Model model, @RequestParam("members_id") String members_id,
			@RequestParam("members_pw") String members_pw, HttpSession session) {
    
    
    	Members1 members = memberService1.getLogin(members_id, members_pw);
		if (members != null) { // member 객체에 값이 들어있다면!
			session.setAttribute("loginSession", members);
			return "login-register"; // 로그인 성공하면 메인 페이지로 보내기
		} else { // 일치하는 정보가 없다면
			model.addAttribute("error", "일치하는 아이디 비밀번호가 없습니다.");
			model.addAttribute("m", new Members1());
			return "login";// 다시 로그인 입력창으로 돌려보내기
		}
    }
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();// invalidate 무효시키다. 없던일로만들다.
			return "redirect:/";
		}
    
    
    
}