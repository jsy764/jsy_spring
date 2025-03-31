package com.bookSystem.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookSystem.DTO.BookBasketDto;
import com.bookSystem.DTO.BookListDto;
import com.bookSystem.DTO.BookSearchDto;
import com.bookSystem.DTO.BookWriteDto;
import com.bookSystem.Entity.Book;
import com.bookSystem.Entity.MyBasket;
import com.bookSystem.Repository.BookRepository;
import com.bookSystem.Repository.MemberRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	public void bookSave(BookWriteDto bookWriteDto) {
		Book book = Book.of(bookWriteDto);
		bookRepository.save(book);
	}
	
	public List<BookListDto> bookSearch(BookSearchDto bookSearchDto){
		
		List<BookListDto> bookListDtos = new ArrayList<>();
		
		List<Book> books = bookRepository.findByAll(bookSearchDto);
		
		for(Book book : books) {
			BookListDto bookListDto = new BookListDto(
					book.getBookId(), book.getBook_author(), book.getBook_publishing()
					, book.getBook_title()
					);
			bookListDtos.add(bookListDto);
		}
		return bookListDtos;
	}
	
	// 도서클릭하여 내 장바구니에 넣기
	// 클릭한 도서의 bookid 값 받아야되고, 현재 로그인한 회원 id가 필요
	public void myBasketSave(int bookId, String email) {
		
		Map<String, Integer> my = new HashMap<>();
		my.put("mid", memberRepository.findByEmail(email));
		my.put("bid", bookId);
		
		bookRepository.basketSave(my);
	}
	
	// 대출 메뉴 페이지에 내장바구니 도서 목록 띄우기
	// 현재 로그인한 회원의 장바구니 목록 띄우기
	// 	-> 컨트롤부터 로그인 정보 가져오기
	public List<BookBasketDto> myBasketList(String email){
		int memberId = memberRepository.findByEmail(email);
		
		List<MyBasket> myBasketList = bookRepository.selectBasket(memberId);
		
		List<BookBasketDto> bookBasketDtos = new ArrayList<>();
		
		for(MyBasket temp : myBasketList) {
			Book book = bookRepository.findById(temp.getBook_id());
			BookBasketDto basketDto = BookBasketDto.of(temp, book);
			
			bookBasketDtos.add(basketDto);
		}
		
		return bookBasketDtos;
	}
	
	// 대출 메뉴 페이지에 내장바구니 도서 목록 띄우기
	
}
