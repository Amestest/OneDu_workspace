package com.onedumall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onedumall.dto.Board;

@Mapper
public interface BoardMapper {
	List<Board> getAllBoard();
	
	Board getBoardById(int question_no);

}
