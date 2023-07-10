package librarydatamanagementapp;

class LibraryItem {
	int id;
	String title;
	int year;
}

class Book extends LibraryItem{
	String author;
}

class Magazine extends LibraryItem{
	private int issue;
	public void setter(int issue) {
		this.issue=issue;
	}
	public int getter() {
		return issue;
	}
}

public class LibraryDataManagementApp {
	public static void main(String[] args) {
		Magazine magazine =new Magazine();
		Book book = new Book();
		magazine.id=1;
		magazine.title="Your the password of my life";
		book.year=2019;
		book.author="Sudheep Nagarkar";
		System.out.println(magazine.id+" "+magazine.title+" "+book.year+" "+book.author);
		magazine.setter(2020);
		System.out.println(magazine.getter());
	}
}
