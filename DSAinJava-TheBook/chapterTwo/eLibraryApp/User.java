package eLibraryApp;

import java.util.ArrayList;

public class User {
	private ArrayList<Book> purchasedBooks;

	User() {
		purchasedBooks = new ArrayList<>();
	}

	public void buyBook(Book book, Library library) {

		if (library.getBooks().contains(book)) {
			purchasedBooks.add(book);
			library.getBooks().remove(book);
		} else {
			System.out.println("Book not available in the library");
		}
	}

	public void viewPurchasedBooks() {
		System.out.println("Your purchased books: ");
		for (Book book : purchasedBooks) {
			System.out.println(book.getTitle() + " by " + book.getAuthor());
		}
	}

	public void readBook(Book book) {
		if (purchasedBooks.contains(book)) {
			System.out.println(book.getContent());
		} else {
			System.out.println("You have not purchased the book yet.");
		}
	}
}
