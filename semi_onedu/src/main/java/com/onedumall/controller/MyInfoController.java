package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.onedumall.dto.MyInfo;
import com.onedumall.service.MyInfoService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class MyInfoController {

	@Autowired
	private MyInfoService myinfoService;
	

	
}
