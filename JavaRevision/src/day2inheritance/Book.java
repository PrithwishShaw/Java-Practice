package day2inheritance;

public class Book {

	String title;
	int pages;

	public Book(String title, int pages) {
		super();
		this.title = title;
		this.pages = pages;
	}

	public void displayBookInfo() {
		System.out.println("Title: " + title + " (" + pages + " pages)");
	}

	public static void main(String[] args) {

		Book book1 = new Book("Rich Dad Poor Dad", 421);
		Book book2 = new Book("Computer Application", 645);
		Book book3 = new Book("History", 584);

		Book[] books = { book1, book2, book3 };

		Library library = new Library("Greate Calcutta Library", 1457, books);
		library.displayLibraryInfo();

	}

}
