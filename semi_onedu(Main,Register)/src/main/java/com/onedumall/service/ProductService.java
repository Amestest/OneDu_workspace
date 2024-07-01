package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Products;
import com.onedumall.mapper.ProductMapper;

@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	public List<Products> searchProduct(String keyword) {
		return productMapper.searchProduct(keyword);
	}
}
