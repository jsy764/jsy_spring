package com.talk.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.talk.DTO.MemberSignInDto;
import com.talk.DTO.MemberSignUpDto;
import com.talk.Service.BoardService;

@Controller
public class MainController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("recentList", boardService.boardRecent());
		model.addAttribute("poplarList", boardService.boardPopular());
		model.addAttribute("memberSignInDto", new MemberSignInDto());
		model.addAttribute("memberSignUpDto", new MemberSignUpDto());
		return "index";
	}
}
