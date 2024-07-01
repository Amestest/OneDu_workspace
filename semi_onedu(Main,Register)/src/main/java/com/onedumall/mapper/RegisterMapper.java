package com.onedumall.mapper;



import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.Members;

@Mapper
public interface RegisterMapper {
		void insertRegister(Members members);
		
}
