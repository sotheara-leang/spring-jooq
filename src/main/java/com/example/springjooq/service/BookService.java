package com.example.springjooq.service;

import com.example.springjooq.jooq.tables.pojos.Book;

public interface BookService {

	Book selectById(Integer id);
	
	void insert(Book book);
	
	void update(Book book);
	
	void delete(Integer id);
}
