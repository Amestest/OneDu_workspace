package com.onedumall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// 필요할경우 log info 호출
@Controller
public class BoardController {
	
	@GetMapping("/boardList")
	public String getAllBoard(Model model) {
		//List<Board> bd = boardService.getAllBoard();
		// model.addAttribute("board", bd);
		return "BoardList";//나중에 index로 작성한 html을 BoardList 변경하기
	}
	
	@GetMapping("/boardWriter")
	public String writeBoard() {
		
		// insert
		return "write";
	}
	
	
	@GetMapping("/boardView/{QUESTION_NO}") // 게시판 상세보기 {} id 값으로 정보 가져오게 변경
	public String viewBoard(/*Model model, @PathVariable int board_id*/) {
		// Board 객체로 가져온 아이디 값을 가져오기 
		//Board bd = boardSerivce.getBoardById(board_id);
		// model.addAttribute("board", bd);
		return "view";
	}
	
	@GetMapping("/boardEdit")
	public String editBoard() {
		return "edit";
	}
}
