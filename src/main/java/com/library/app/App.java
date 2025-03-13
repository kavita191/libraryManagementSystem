package com.library.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.enums.BookCategory;
import com.library.model.Book;
import com.library.model.EBook;
import com.library.model.User;
import com.library.services.CheckoutService;
import com.library.services.InventoryService;

/**
 * Hello world!
 */
public class App {

	private static List<Book> books = new ArrayList<Book>();
	private static List<User> users = new ArrayList<User>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
     
		CheckoutService checkoutService = new CheckoutService();
		InventoryService inventoryService = new InventoryService(books);
		
		while(true) {
			printMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			
		switch (choice) {
		case 1: {
			addNewBook();
			break;
		}
        case 2: {
			registerUser();
        	break;
		}
        case 3: {
			performCheckout(checkoutService);
        	break;
		}
        case 4: {
			inventoryService.generateCheckoutReport();
        	break;
		}
        case 5: {
			inventoryService.generateInventoryReport();
        	break;
		}
        case 6: {
			System.out.println("Exiting system...");
			System.exit(0);
        	break;
		}
		default:
			System.out.println("invalid choice");
		}
		}

	}

	private static void performCheckout(CheckoutService checkoutService) {
		Book book = getBookInput();
		User user = new User("kojha", "kavita", "kojha@gmail.com");
		checkoutService.checkOutBook(user, book);
		
	}

	private static void registerUser() {
		// TODO Auto-generated method stub
		User User =getUserInput();
		users.add(User);
		
		
	}

	private static void addNewBook() {
	  Book book = getBookInput();
	  books.add(book);
	  System.out.println("Enter is added successfully");
	}

	private static void printMenu() {
	  System.out.println("Library Management System");
	  System.out.println("1. Add new books");
	  System.out.println("2. Register user");
	  System.out.println("3. Checkout book");
	  System.out.println("4. Generate checkout report");
	  System.out.println("5. Generate inventory report");
	  System.out.println("6. Exit");
	  System.out.println("Enter your choice");
		
	}
	
	private static Book getBookInput() {
		  System.out.println("Enter book title");
		  String title = scanner.next();
		  System.out.println("Enter book Author");
		  String author = scanner.next();
		  System.out.println("Enter book id");
		  int id = scanner.nextInt();
		  Book book = new EBook(title, author, id, BookCategory.NON_FICTION, "abc.com", 24);
		  return book;

	}
	
	private static User getUserInput() {
		  System.out.println("Enter User name");
		  String name = scanner.next();
		  System.out.println("Enter user email");
		  String email = scanner.next();
		  System.out.println("Enter user id");
		  String id = scanner.next();
		  User user = new User(id, name, email);
		  return user;

	}
}
