package com.talk.DTO;

import com.talk.Entity.BoardEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
	private int id;
	private String title;
	private String content;
	private String fileName;
	
	public static BoardEntity to(BoardDto boardDto) {
		
		BoardEntity boardEntity = new BoardEntity();
		
		return boardEntity;
	}
	public static BoardDto from(BoardEntity boardEntity) {
		BoardDto boardDto = new BoardDto();
		
		return boardDto;
	}
}
