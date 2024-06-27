package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Post;

@Mapper
public interface PostMapper {
	List<Post> getAllPost();

	Post getPostById(int post_no);

	void postRegister(Post post);
	
	void updatePost(Post post);
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	List<Post> getAllQnA();
	
	Post getQnAById(int question_no);
	
	void QnARegister(Post post);
	
	void updateQnA(Post post);
		
	
}
