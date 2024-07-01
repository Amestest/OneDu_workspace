package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.Coffee;
import com.example.demo.service.CoffeeService;

@Controller
public class CoffeeController {
	@Autowired
	private CoffeeService coffeeService;
	
	@GetMapping("/coffeeBeanTest1copy2")
	public String coffeeBeanTest() {
		return "coffeeBeanTest1copy2";
	}
	
	@GetMapping("/coffeeDetail/{coffee_id}")
	public String getCoffeeById(Model model, @PathVariable int coffee_id) {
		Coffee coffee = coffeeService.getCoffeeById(coffee_id);
		model.addAttribute("coffee", coffee);
		return "coffeeDetail";
	}
}
