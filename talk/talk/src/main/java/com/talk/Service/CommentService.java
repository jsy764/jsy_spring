package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.Repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRervice;
}
