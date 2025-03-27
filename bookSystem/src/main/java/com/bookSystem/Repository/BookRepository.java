package com.bookSystem.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.bookSystem.Entity.Book;

@Mapper
public interface BookRepository {
	public int save(Book book);
}
