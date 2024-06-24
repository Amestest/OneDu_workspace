package com.onedumall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.onedumall.service.MyInfoService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class MyInfoController {

	@Autowired
	private MyInfoService myinfoService;
	

	
}
