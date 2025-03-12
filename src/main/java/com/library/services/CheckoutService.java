package com.library.services;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.model.PrintBook;
import com.library.model.User;

public class CheckoutService {

	private List<Book> checkedOutBooks = new ArrayList<Book>();
	

	public CheckoutService() {
	}
	public void checkOutBook(User user,Book book) {

		if(book.isAvailable()) {
			if(book instanceof PrintBook) {
				((PrintBook)book).setAvailable(false);

			}
			checkedOutBooks.add(book);
			System.out.println("Checkout successful for:"+ book.getTitle());

		}else {
			System.out.println("Book is not available for checkout");

		}
	}

	public void returnBook(Book book) {
		if (book instanceof PrintBook) {
			((PrintBook) book).setAvailable(true);		
		}
		checkedOutBooks.remove(book);
		System.out.println("Return processed for:"+book.getTitle());

	}





}


