package com.talk.DTO;

import java.time.LocalDate;
import java.util.List;

import com.talk.Entity.BoardEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDetailDto {
	private int id;
	private String title;
	private String memberId;
	private String content;
	private String fileName;
	private int hit;
	private LocalDate writeDate;
	private List<CommentViewDto> commentList;
	
	public static BoardDetailDto of(BoardEntity boardEntity, List<CommentViewDto> commentViewDto) {
		BoardDetailDto boardDetatilDto = new BoardDetailDto();
		boardDetatilDto.setId(boardEntity.getId());
		boardDetatilDto.setTitle(boardEntity.getTitle());
		boardDetatilDto.setContent(boardEntity.getContent());
		boardDetatilDto.setHit(boardEntity.getHit());
		boardDetatilDto.setWriteDate(boardEntity.getWriteDate());
		boardDetatilDto.setCommentList(commentViewDto);
		return boardDetatilDto;
	}
}
