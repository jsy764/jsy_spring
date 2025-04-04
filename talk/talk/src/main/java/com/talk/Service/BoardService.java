package com.talk.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.talk.DTO.BoardDetailDto;
import com.talk.DTO.BoardDto;
import com.talk.DTO.BoardListDto;
import com.talk.Entity.BoardEntity;
import com.talk.Repository.BoardRepository;
import com.talk.Repository.CommentRepository;



@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private FileService fileService;
	
	public void boardSave(BoardDto boardDto, String memberId, MultipartFile multipartFile) {
		
		BoardEntity boardEntity = BoardDto.to(boardDto);
		boardEntity.setMemberId(memberId);
		
		
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
		
		List<BoardEntity> boardEntities = boardRepository.findByOrderByWriteDateDesc();
		
		List<BoardListDto> boardListDtos = new ArrayList<>();
		for(BoardEntity board : boardEntities) {
			BoardListDto dto = BoardListDto.from(board);
			
			boardListDtos.add(dto);
		}
		
		return boardListDtos;
	}
	
	public List<BoardListDto> boardPopular(){
		List<BoardEntity> boardEntities = boardRepository.findByOrderByHitDesc();
		
		List<BoardListDto> boardListDtos = new ArrayList<>();
		for(BoardEntity board : boardEntities) {
			BoardListDto dto = BoardListDto.from(board);
			
			boardListDtos.add(dto);
		}
		
		return boardListDtos;
	}
}
