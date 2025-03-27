package com.bookSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookSystem.DTO.BookWriteDto;
import com.bookSystem.Entity.Book;
import com.bookSystem.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public void bookSave(BookWriteDto bookWriteDto) {
		Book book = Book.of(bookWriteDto);
		bookRepository.save(book);
	}
}
