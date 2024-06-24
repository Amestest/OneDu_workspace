package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Post;
import com.onedumall.mapper.PostMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostService {
	
	@Autowired
	private PostMapper postMapper;
	
	public List<Post> getAllPost(){
		return postMapper.getAllPost();
		
	}
	
	public Post getPostById(int post_no) {
		return postMapper.getPostById(post_no);
	}

}
