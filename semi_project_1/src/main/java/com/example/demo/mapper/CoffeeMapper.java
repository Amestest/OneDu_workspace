package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Coffee;

@Mapper
public interface CoffeeMapper {
	//1. 커피 정보 전체 리스트
	List<Coffee> getAllCoffees();
	//2. 커피 정보 하나만 가져오기
	Coffee getCoffeeById(int coffee_id);
}
