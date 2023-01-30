package com.example.demo;

import java.util.HashSet;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl {

	HashSet<Book> bookList = new HashSet<Book>();

	public HashSet<Book> findAllBook() {
		if (bookList.isEmpty())
			return null;
		else
			return bookList;
	}

	public Book findBookByID(long id) {
		Book book = bookList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
		return book;
	}

	public void addBook(Book b) {
		bookList.add(b);
	}

	public void deleteAllData() {
		bookList.clear();
	}
}