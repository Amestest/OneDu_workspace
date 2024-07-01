package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khmall.dto.Product;
import com.khmall.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/")
	public String getStart() {
		return "product-index";
	}

	@GetMapping("/product")
	public String getProduct(Model model) {
		model.addAttribute("product", new Product());
		return "product"; // html 파일이름
	}

	@PostMapping("/product")
	public String INSERTPRODUCT(@RequestParam("PRODUCT_OPTION") String PRODUCT_OPTION,
								@RequestParam("PRODUCT_COUNT") int PRODUCT_COUNT, 
								@RequestParam("PRODUCT_PRICE") int PRODUCT_PRICE,
								@RequestParam("PRODUCT_NAME") String PRODUCT_NAME) {

		
		System.out.println("PRODUCT_OPTION : " + PRODUCT_OPTION);
		System.out.println("PRODUCT_COUNT : " + PRODUCT_COUNT);
		System.out.println("PRODUCT_PRICE : " + PRODUCT_PRICE);
		System.out.println("PRODUCT_NAME : " + PRODUCT_NAME);

		productService.INSERTPRODUCT(PRODUCT_OPTION, PRODUCT_COUNT, PRODUCT_PRICE, PRODUCT_NAME);
		return "redirect:/";
	}
}
