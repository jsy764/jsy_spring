package com.talk.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberEntity {
	private int id;
	private int memberId;
	private String password;
	private String name;
	private String email;
	private String tel;

	public static MemberEntity to(MemberSignUpDto ) {
		
	}
}
