package com.khmall.mapper;

import org.apache.ibatis.annotations.Mapper;



import com.khmall.dto.Product;



@Mapper		
public interface ProductMapper {

	
	public void INSERTPRODUCT(Product product);
	
		

}
