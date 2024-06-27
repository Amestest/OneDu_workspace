package com.example.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dto.Post;
import com.example.mapper.PostMapper;








@Service
public class PostService {
	
	@Autowired
	private PostMapper postMapper;
	

	

	
	public List<Post> getAllPost(){
		List<Post> posts = postMapper.getAllPost();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		for (Post post : posts) {
			post.setPost_date_str(dateFormat.format(post.getPost_date()));
		}
		return posts;		
	}
	
	public Post getPostById(int post_no) {
		Post post = postMapper.getPostById(post_no);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		post.setPost_date_str(dateFormat.format(post.getPost_date()));

		return post;
		//return postMapper.getPostById(post_no);
	}

	public void postRegister(Post post) {
		postMapper.postRegister(post);
		
	}
	
	public void updatePost(Post post) {
		postMapper.updatePost(post);
	}
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	 public List<Post> getAllQnA() {
	        List<Post> posts = postMapper.getAllQnA();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
	        for (Post post : posts) {
	            post.setQuestion_date_str(dateFormat.format(post.getQuestion_date()));
	        }
	        return posts;
	    }

	    public Post getQnAById(int question_no) {
	        Post post = postMapper.getQnAById(question_no);
	        if (post != null) {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
	            post.setQuestion_date_str(dateFormat.format(post.getQuestion_date()));
	        }
	        return post;
	    }

	    public void QnARegister(Post post) {
	        postMapper.QnARegister(post);
	    }

	    public void updateQnA(Post post) {
	        postMapper.updateQnA(post);
	    }
	   
	   
	
	
}

