package com.bookSystem.DTO;

import com.bookSystem.Entity.Book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookWriteDto {
	private String book_title;
	private String book_author;
	private String book_publishing;
	private int book_year;
	
	public static BookWriteDto of(Book book) {
		BookWriteDto bookWriteDto = new BookWriteDto();
		bookWriteDto.setBook_author(book.getBook_author());
		bookWriteDto.setBook_publishing(book.getBook_publishing());
		bookWriteDto.setBook_title(book.getBook_title());
		bookWriteDto.setBook_year(book.getBook_year());
		
		return bookWriteDto;
	}
}
// DTO에서 사용자가 입력한 데이터를 받아오고
// Entity에 넘겨서 데이터베이스 저장

// 데이터베이스에서 가져와서 Entity에 저장하고
// DTO에 넘겨서 뷰페이지 출력





