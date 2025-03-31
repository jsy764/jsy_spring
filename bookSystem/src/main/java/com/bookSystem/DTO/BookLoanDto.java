package com.bookSystem.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookLoanDto {
	private int id;
	private int member_id;
	private int book_id;
	private String status;
	private String long_date;
	private String return_date;
	
}
