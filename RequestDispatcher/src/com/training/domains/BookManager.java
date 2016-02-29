package com.training.domains;

import java.util.HashMap;

import com.training.entity.Book;

public class BookManager {

	private HashMap<Long,Book> bookList;

	public BookManager() {
		
		super();
		
		bookList= new HashMap<Long,Book>();
		
		//init();
	}
	
	public void init() {
		
		Book book1 = new Book(101, "Life is What you Make It", "Preety Shenoy", 250.00);
		Book book2 = new Book(201, "Second Book", "Second Author", 150.00);
		Book book3 = new Book(301, "Third Book", "Third Author", 255.00);
		
		bookList.put(book1.getBookNumber(), book1);
		bookList.put(book2.getBookNumber(), book2);
		bookList.put(book3.getBookNumber(), book3);
	}
	
	public HashMap<Long,Book> getAllBooks() {
		
		return bookList;
	}
	
	public Book findBookById(long id) {
		
		return bookList.get(id);
	}
}
