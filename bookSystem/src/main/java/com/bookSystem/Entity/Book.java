package com.bookSystem.Entity;

import com.bookSystem.DTO.BookWriteDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
	private int bookId;
	private String book_title;
	private String book_author;
	private String book_publishing;
	private int book_year;
	
	public static Book of(BookWriteDto bookWriteDto) {
		Book book = new Book();
		book.setBook_author(bookWriteDto.getBook_author());
		book.setBook_publishing(bookWriteDto.getBook_publishing());
		book.setBook_title(bookWriteDto.getBook_title());
		book.setBook_year(bookWriteDto.getBook_year());
		
		return book;
	}
	
}
