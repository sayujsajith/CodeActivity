package Question3;
import java.util.*;

public class BookStore {
	public static void main(String[] args) {
		  ArrayList<Book>b=new ArrayList<Book>();
		  b.add(new Book("why we sleep","matthew walker",1500));
		  b.add(new Book("fire of life","hari",400));
		  b.add(new Book("sometime it's me and my feeling","sayuj",1000));
		  System.out.println("the collection of books are");
		  for(Book b1:b)
		  {
			  System.out.println(b1.tittle+" "+b1.author+" "+b1.price);
			 
		  }
		  System.out.println("");
			System.out.println("Enter the book name");
			Scanner sc=new Scanner(System.in);
			String t=sc.next();
			for(Book b2:b)
			  {
				if(b2.tittle.contains(t)) {
					System.out.println("book available");
				  System.out.println(b2.tittle+" "+b2.author+" "+b2.price);
				 
			  }
				System.out.println("-");
				
			System.out.println("Enter the author name");	
				Scanner Sc=new Scanner(System.in);
				String au=sc.next();
				for(Book b3:b)
				  {
					if(b3.tittle.contains(au)) {
						System.out.println("book available");
					  System.out.println(b3.tittle+" "+b3.author+" "+b3.price);
			
			 }
		 
			}

		      }
			 }
		}


