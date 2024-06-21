package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.MyInfo;

@Mapper
public interface MyinfoMapper {
	List<MyInfo> getAllmember();
	
}
