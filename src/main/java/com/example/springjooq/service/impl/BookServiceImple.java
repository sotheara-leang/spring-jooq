package com.example.springjooq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjooq.service.BookService;
import com.example.springjooq.tables.daos.BookDao;
import com.example.springjooq.tables.pojos.Book;

@Service
public class BookServiceImple implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public Book selectById(Integer id) {
		return bookDao.fetchOneById(id);
	}

	@Override
	public void insert(Book book) {
		bookDao.insert(book);
	}

	@Override
	public void update(Book book) {
		bookDao.update(book);
	}

	@Override
	public void delete(Integer id) {
		bookDao.deleteById(id);
	}
}
