package com.talk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.DTO.BoardDetailDto;
import com.talk.DTO.BoardDto;
import com.talk.DTO.BoardListDto;
import com.talk.Repository.BoardRepository;
import com.talk.Repository.CommentRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	public void boardSave(BoardDto boardDto) {
		
	}
	
	public void boardDelete(int id) {
		
	}
	
	public void boardUpdate(BoardDto boardDto) {
		
	}
	
	public BoardDetailDto boardDetail(int id) {
		
		return null;
	}
	
	public List<BoardListDto> boardList(int pageNum){
		
		return null;
	}
	
	public int boardCount() {
		
		return 0;
	}
	
	public List<BoardListDto> boardRecent(){
		
		return null;
	}
	
	public List<BoardListDto> boardpopular(){
		
		return null;
	}
}
