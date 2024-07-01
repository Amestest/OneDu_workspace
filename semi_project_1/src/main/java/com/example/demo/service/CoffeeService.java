package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Coffee;
import com.example.demo.mapper.CoffeeMapper;

@Service
public class CoffeeService {
	@Autowired
	private CoffeeMapper coffeeMapper;
	
	//1. 커피 정보 전체 리스트
	public List<Coffee> getAllCoffees() {
		return coffeeMapper.getAllCoffees();
	}
	//2. 커피 정보 하나만 가져오기
	public Coffee getCoffeeById(int coffee_id) {
		return coffeeMapper.getCoffeeById(coffee_id);
	}
}
