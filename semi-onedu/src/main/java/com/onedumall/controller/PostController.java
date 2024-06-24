package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.onedumall.dto.Post;
import com.onedumall.service.PostService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/boardList")
	public String getAllPost(Model model) {
		List<Post> posts = postService.getAllPost();
		model.addAttribute("posts" , posts);
		log.info("db값 확인" + posts);
		
	/*@GetMapping("/boardList")
	public String listPost() {*/
		return "boardlist";
	}
	
	@GetMapping("/boardWrite")
	public String writePost() {
		
		return "boardwrite";
	}
	
	/*@GetMapping("/boardView/{post_no}")
	public String getPostById(Model model, @PathVariable int post_no) {
		Post post = postService.getPostById(post_no);
		model.addAttribute("post", post);*/
	@GetMapping("/boardView")
		public String viewPost() {
		return "boardview";
	}
	
	@GetMapping("/boardEdit")
	public String editPost() {
		return "boardedit";
	}
}
