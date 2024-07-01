package com.khmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.Product;
import com.khmall.mapper.ProductMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	@Autowired
	private ProductMapper productmapper;

	public void insertProduct(String PRODUCT_OPTION, int PRODUCT_COUNT, int PRODUCT_PRICE, String PRODUCT_NAME) {
		Product product = new Product();
		product.setPRODUCT_OPTION(PRODUCT_OPTION);
		product.setPRODUCT_NAME(PRODUCT_NAME);
		product.setPRODUCT_PRICE(PRODUCT_PRICE);
		product.setPRODUCT_COUNT(PRODUCT_COUNT);
		log.info(" ************* product **********" + product.toString());

		productmapper.insertProduct(product);
	}

}
