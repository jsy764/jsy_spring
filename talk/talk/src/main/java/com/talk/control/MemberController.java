package com.talk.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.talk.DTO.MemberSignUpDto;
import com.talk.Service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	public String signUp(MemberSignUpDto memberSignUpDto, Model model) {
		
		return null;
	}
	
	@PostMapping("/signIn")
	public String signIn(MemberSignUpDto memberSignUpDto, Model model) {
		
		return null;
	}
	
}
