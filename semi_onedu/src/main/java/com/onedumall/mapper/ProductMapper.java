package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.onedumall.dto.Products;

@Mapper
public interface ProductMapper {
	
	List<Products> searchProducts(@Param("keyword") String keyword);
}
