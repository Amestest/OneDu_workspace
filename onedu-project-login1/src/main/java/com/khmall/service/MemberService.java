package com.khmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.khmall.dto.Members;
import com.khmall.mapper.MembersMapper;


@Service
public class MemberService {
	@Autowired
	private MembersMapper membersMapper;

	public Members getLogin(String members_id, String members_pw) {
		return membersMapper.getLogin(members_id, members_pw);
	}

}