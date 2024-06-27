package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.Post;
import com.example.service.PostService;

import lombok.extern.slf4j.Slf4j;



@Controller
@Slf4j
public class PostController {

	@Autowired
	private PostService postService;

	@GetMapping("/boardList")
	public String getAllPost(Model model) {
		List<Post> posts = postService.getAllPost();
		model.addAttribute("posts", posts);
		log.info("db값 확인" + posts.toString());
		return "boardlist";
	}

	@GetMapping("/boardWrite")
	public String writeForm(Model model) {
		model.addAttribute("post", new Post());
		return "boardwrite";
	}

	@PostMapping("/boardWrite")
	public String postRegister(@RequestParam("post_title") String post_title,
			@RequestParam("post_info") String post_info, Model model) {
		Post post = new Post();
		post.setPost_title(post_title);
		post.setPost_info(post_info);
		post.setPost_date(new Date());

		postService.postRegister(post);
		model.addAttribute("msg", "글이 등록되었습니다");
		log.info("확인하기 post" + post);
		return "redirect:/boardList";
	}

	@GetMapping("/boardView/{post_no}")
	public String getPostById(Model model, @PathVariable int post_no) {
		Post post = postService.getPostById(post_no);
		model.addAttribute("post", post);
		return "boardview";
	}

	@GetMapping("/boardEdit/{post_no}")
	public String updatePost(Model model, @PathVariable int post_no) {
		Post post = postService.getPostById(post_no);
		
		model.addAttribute("post", post);
		log.info("겟맵핑 업데이트 확인" + post.toString());
		return "boardedit";
	}
	
	@PostMapping("/boardEdit/{post_no}")
	public String updatePost(@PathVariable int post_no,Post updatePost , Model model) {
		Post post = postService.getPostById(post_no);
		if (post != null) {
            post.setPost_title(updatePost.getPost_title());
            post.setPost_info(updatePost.getPost_info());
            postService.updatePost(post);
            log.info("포스트맵핑 업데이트 확인" + post.toString());
            model.addAttribute("msg", "글이 수정되었습니다");
		}
		
		return "redirect:/boardView/" + post_no;
	}
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	 @GetMapping("/qnaList")
	    public String getAllQnA(Model model) {
	        List<Post> posts = postService.getAllQnA();
	        model.addAttribute("posts", posts);
	        log.info("db값 확인" + posts.toString());
	        return "qnalist";
	    }

	    @GetMapping("/qnaWrite")
	    public String writeQnAForm(Model model) {
	        model.addAttribute("post", new Post());
	        return "qnawrite";
	    }

	    @PostMapping("/qnaWrite")
	    public String QnARegister(@RequestParam("question_title") String question_title,
	                              @RequestParam("question_info") String question_info, Model model) {
	        Post post = new Post();
	        post.setQuestion_title(question_title);
	        post.setQuestion_info(question_info);
	        post.setQuestion_date(new Date());

	        postService.QnARegister(post);
	        model.addAttribute("msg", "글이 등록되었습니다");
	        log.info("확인하기 post" + post);
	        return "redirect:/qnaList";
	    }

	    @GetMapping("/qnaView/{question_no}")
	    public String getQnAById(Model model, @PathVariable int question_no) {
	        Post post = postService.getQnAById(question_no);
	        model.addAttribute("post", post);
	        return "qnaview";
	    }

	    @GetMapping("/qnaEdit/{question_no}")
	    public String updateQnAForm(Model model, @PathVariable int question_no) {
	        Post post = postService.getQnAById(question_no);
	        
	        model.addAttribute("post", post);
	        log.info("겟맵핑 업데이트 확인" + post.toString());
	        return "qnaedit";
	    }

	    @PostMapping("/qnaEdit/{question_no}")
	    public String updateQnA(@PathVariable int question_no, Post updateQnA, Model model) {
	        Post post = postService.getQnAById(question_no);
	        if (post != null) {
	            post.setQuestion_title(updateQnA.getQuestion_title());
	            post.setQuestion_info(updateQnA.getQuestion_info());
	            postService.updateQnA(post);
	            log.info("포스트맵핑 업데이트 확인" + post.toString());
	            model.addAttribute("msg", "글이 수정되었습니다");
	        }
	        return "redirect:/qnaView/" + question_no;
	    }
	
}
