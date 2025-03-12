package com.library.services;

import java.util.List;

import com.library.model.Book;

public class InventoryService implements ReportService{
	
	private List<Book> books;


	public InventoryService(List<Book> books) {
		super();
		this.books = books;
	}

	@Override
	public void generateInventoryReport() {
		System.out.println("Books in the inventory");
		for (Book book : books) {
			System.out.println("Title"+ book.getTitle()+ "Author"+ book.getAuthor()+"ID"+book.getId());
		}
		
	}

	@Override
	public void generateCheckoutReport() {
		// TODO Auto-generated method stub
		
	}
	

}
