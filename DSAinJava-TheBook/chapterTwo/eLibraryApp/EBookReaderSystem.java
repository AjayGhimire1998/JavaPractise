package eLibraryApp;

public class EBookReaderSystem {

	public static void main(String[] args) {
		Library library = new Library();
		User user = new User();

		Book book = library.getBooks().get(0);
		user.buyBook(book, library);

		user.viewPurchasedBooks();

		user.readBook(book);

	}

}
