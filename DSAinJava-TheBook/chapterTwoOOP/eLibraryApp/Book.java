package eLibraryApp;

/**
 * P-2.33 Write a Java program that simulates a system that supports the
 * functions of an ebook reader. You should include methods for users of your
 * system to “buy” new books, view their list of purchased books, and read their
 * purchased books. Your system should use actual books, which have expired
 * copyrights and are available on the Internet, to populate your set of
 * available books for users of your system to “purchase” and read.
 * 
 * @author ajayghimire
 *
 */
public class Book {
	private String title;
	private String author;
	private String content;

	Book(String tit, String auth, String cont) {
		title = tit;
		author = auth;
		content = cont;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

}
