package Question1;
import java.util.Scanner;

public class Division {
	public static int Divide(int a,int b)
	{
		int d=0;
		try
		{
			 d=a/b;
			 System.out.println(d);
			 
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
				
		}
		return d;
		
	}	
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int y=sc.nextInt();
		
		int result=Divide(x,y);
		System.out.println(result);
		


	}

}
