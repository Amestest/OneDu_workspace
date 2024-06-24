package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.Post;

@Mapper
public interface PostMapper {
	List<Post> getAllPost();
	
	Post getPostById(int post_no);
}
