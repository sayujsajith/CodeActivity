package Com.BookAndAuthor;

public class BookDetails {
	static void display(Book b) {
		System.out.println("Book type : " + b.getBookType());
		System.out.println("Book Author name : " + b.getAur());
		System.out.println("Book price : " + b.getPrice());
		System.out.println("Year of publictaion of Book: " + b.getYearOfPublication());

	}
	

	public static void main(String[] args) {
		Book b = new Book("Race Of Madness", 2022,799.00, new Author("sayuj sajith ,", 23));
		display(b);
	}

	}


