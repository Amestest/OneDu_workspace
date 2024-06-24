package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.MyInfo;
import com.onedumall.mapper.MyinfoMapper;

@Service
public class MyInfoService {
	@Autowired
	private MyinfoMapper myinfoMapper;
	
	public List<MyInfo> getAllmember(){
		return myinfoMapper.getAllmember();
	}

}
