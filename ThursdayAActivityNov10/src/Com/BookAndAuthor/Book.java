package Com.BookAndAuthor;

public class Book {
	private String bookType;
	private int yearOfPublication;
	private double price;
	private Author aur;
	
	public Book()
	{
		super();
	}

	public Book(String bookType, int yearOfPublication, double price, Author aur) 
	{
		this.bookType = bookType;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.setAur(aur);
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAur() {
		return aur;
	}

	public void setAur(Author aur) {
		this.aur = aur;
	}

}
