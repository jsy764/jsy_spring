package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.DTO.CommentDto;
import com.talk.DTO.MemberSignInDto;
import com.talk.DTO.MemberSignUpDto;
import com.talk.Repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRervice;
	
	public void commentSave(CommentDto commentDto) {
		
	}
	
	public void commentDelete(int id) {
		
	}
}
