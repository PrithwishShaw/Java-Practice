package day2inheritance;

public class Library {

	String name;
	int year;
	Book[] books;

	public Library(String name, int year, Book[] books) {
		super();
		this.name = name;
		this.year = year;
		this.books = books;
	}

	public void displayLibraryInfo() {
		System.out.println("Name: " + name + "\nYear: " + year);
		System.out.println("Books available: ");
		for (Book book : books) {
			book.displayBookInfo();
		}
	}

}
