package eLibraryApp;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;

	Library() {
		books = new ArrayList<>();
		books.add(new Book("Subtle Art of Not Giving a Fnck", "Mark Ranson",
				"This books is awesome for self development"));

		books.add(new Book("Atomic Habits", "Idk whatevr", "this book is all about habit developments"));
		books.add(new Book("A bried Intro to time", "Stephen Hawking",
				"This book is all about the perception of Time and Universe"));
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void addBook(Book book) {
		books.add(book);
	}
}
