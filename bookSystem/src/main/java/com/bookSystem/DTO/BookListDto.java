package com.bookSystem.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookListDto {
	private int bookId; // 검색결과 출력하고 대출선택을 위해
	private String bookTitle;
	private String bookAuthor;
	private String bookpublishing;
}
