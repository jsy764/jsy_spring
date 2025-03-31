package com.bookSystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class BookSearchDto {
	private String keyword; // 검색어
	private String option; // 검색 옵션( 제목 )
	
}
