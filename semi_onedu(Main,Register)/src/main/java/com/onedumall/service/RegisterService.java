package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Members;
import com.onedumall.mapper.RegisterMapper;

@Service
public class RegisterService {
	@Autowired
	private RegisterMapper registerMapper;
	
	public void insertRegister(Members members) {
		registerMapper.insertRegister(members);
	}
	
	
}
