package com.library.model;

import com.library.enums.BookCategory;

public abstract class Book {

	private String title;
	private String author;
	private int id;
	private BookCategory category;

	

	public Book(String title, String author, int id, BookCategory category) {
		super();
		this.title = title;
		this.author = author;
		this.id = id;
		this.category = category;
	}

	public Book() {

	}
    //abstract method for polymorphism
	public abstract boolean isAvailable();
    public abstract String getBookType();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}
    
    

}
