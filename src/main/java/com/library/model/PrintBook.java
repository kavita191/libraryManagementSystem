package com.library.model;

import com.library.enums.BookCategory;

public class PrintBook extends Book {
	
	private int shelfNumber;
	private boolean available;
	public PrintBook(String title, String author, int id, BookCategory category, int shelfNumber, boolean available) {
		super(title, author, id, category);
		this.shelfNumber = shelfNumber;
		this.available = available;
	}
	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getBookType() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getShelfNumber() {
		return shelfNumber;
	}
	public void setShelfNumber(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	

}
