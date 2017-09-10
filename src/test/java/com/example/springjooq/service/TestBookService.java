package com.example.springjooq.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springjooq.AbstractTestCase;
import com.example.springjooq.tables.pojos.Book;

public class TestBookService extends AbstractTestCase {

	@Autowired
	private BookService bookService;
	
	@Test
	public void testSelectById() {
		Book book = bookService.selectById(1);
		System.out.println(book);
	}
}
