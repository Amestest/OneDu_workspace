package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.Members;
import com.onedumall.service.MyInfoService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MypageMainController {
	@Autowired
	private MyInfoService myinfoService;

	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("m", new Members());
		return "login";
	}

	@PostMapping("/login")
	public String getLogin(Model model, @RequestParam("members_id") String members_id,
			@RequestParam("members_pw") String members_pw, HttpSession session) {

		Members members = myinfoService.getLogin(members_id, members_pw);
		System.out.println("member  : " + members);
		if (members != null) { // member 객체에 값이 들어있다면!
			session.setAttribute("loginSession", members);
			return "mypage_home"; // 로그인 성공하면 메인 페이지로 보내기
		} else { // 일치하는 정보가 없다면
			model.addAttribute("error", "일치하는 아이디 비밀번호가 없습니다.");
			model.addAttribute("m", new Members());
			return "login";// 다시 로그인 입력창으로 돌려보내기
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();// invalidate 무효시키다. 없던일로만들다.
		return "redirect:/";
	}

	@GetMapping("/mypage_home")
	public String MypageHome(HttpSession session, Model model) {

		return "mypage_home";
	}

	@GetMapping("/info")
	public String getAllmember(Model model) {
		List<Members> infoList = myinfoService.getAllmember();
		log.info("infoList : " + infoList);
		model.addAttribute("infoList", infoList);
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
	
	@GetMapping("/deleteMember")
	public String deleteMember(HttpSession session ) {
		//현재 로그인이된 세션의 정보를 가지고 와서 멤버정보 조회하는 코드
		Members member = (Members) session.getAttribute("loginSession");
						
		//만약에 로그인이 되어있지 않은데 접촉하려한다. 그러면 바로 홈페이지로 돌려보내자
		if(member == null) {
			return "redirect:/login";
			}
		
		myinfoService.deleteMember(member.getMembers_id());//session에 저장된 member_id를 가져오겠다
		session.invalidate();//삭제후 로그인 없던일로 처리
		return "redirect:/";
		
	}

}
