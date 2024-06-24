package com.onedumall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Board;
import com.onedumall.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	public List<Board> getAllBoard(){
		 return boardMapper.getAllBoard();
	}
	
	public Board getBoardById(int QUESTION_NO) {
		return boardMapper.getBoardById(QUESTION_NO);
	}
}
