package com.talk.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talk.DTO.MemberSignInDto;
import com.talk.DTO.MemberSignUpDto;
import com.talk.Entity.MemberEntity;
import com.talk.Repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public void memberSave(MemberSignUpDto memberSignUpDto) {
		MemberEntity memberEntity = MemberEntity.from(memberSignUpDto);
		memberRepository.insert(memberEntity);
	}
	
	public boolean memberLogin(MemberSignInDto memberSignInDto) {
		
		MemberEntity memberEntity = MemberSignInDto.to(memberSignInDto);
		return !memberRepository.findByMemberIdAndPassword(memberEntity);
		
		// return false;
	}
}
