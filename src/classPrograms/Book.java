package classPrograms;

public class Book {
	
	String author;
	String title;
	int pageCount;
	
	// One Non parameterized constructor to allow methods to run as well
	public Book() {
	}
	
	
	// Constructor to take title, pages, author
	Book(String author, int pageCount, String title){
		this.author = author;
		this.pageCount = pageCount;
		this.title = title;
	}
	
	String getAuthor() {
		return author;
	}
	
	String getName() {
		return title;
	}
	
	int getpages() {
		return pageCount;
	}
	
	
	
		

}
