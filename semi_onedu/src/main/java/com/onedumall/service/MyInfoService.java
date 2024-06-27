package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Members;
import com.onedumall.mapper.MyinfoMapper;

@Service
public class MyInfoService {
	@Autowired
	private MyinfoMapper myinfoMapper;
	
	//로그인
	public Members getLogin(String members_id, String members_pw) {
		return myinfoMapper.getLogin(members_id, members_pw);
	}
	
	//회원정보 확인
	public List<Members> getAllmember(){
		return myinfoMapper.getAllmember();
	}
	
	//개인정보 변경
	public void updateMember(Members members) {  
		myinfoMapper.updateMember(members);
	}
	
	//비밀번호 변경
	public void pwChange (Members members) {
		myinfoMapper.pwChange(members);
	}
	
	//회원 탈퇴
	public void deleteMember(String members_id) {
		myinfoMapper.deleteMember(members_id);
	}

}
