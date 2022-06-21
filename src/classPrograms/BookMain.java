package classPrograms;

public class BookMain {

	public static void main(String[] args) {

		Book book1 = new Book("I.E Irodov", 777, "Quantam Physics");
		
		book1.getAuthor();
		System.out.println("Author of book is: "+ book1.getAuthor());
		
		book1.getName();
		System.out.println("Name of book is: "+ book1.getName());
		
		book1.getAuthor();
		System.out.println("Pages in book are: "+ book1.getpages());
		
		
	}

}
