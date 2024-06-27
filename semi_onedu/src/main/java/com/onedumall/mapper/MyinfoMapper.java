package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.onedumall.dto.Members;

@Mapper
public interface MyinfoMapper {
	//회원정보 가져오기
	List<Members> getAllmember();
	
	//회원 탈퇴하기
	void deleteMember (@Param("members_id") String members_id);
	
	//개인정보 변경
	void updateMember(Members members);
	
	//비밀번호 변경
	void pwChange(Members members);
	
	//로그인
	Members getLogin(@Param("members_id") String members_id, @Param("members_pw") String members_pw);
	
}

