package Ques3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Password");
		String Password=sc.next();
		String regex = "[mnbv@!987]";
		Pattern p= Pattern.compile(regex);
		Matcher m= p.matcher(Password);
		boolean matchFound=m.find();
		if(matchFound)
			System.out.println("Password is Valid");
		else
			System.out.println("Invalid Password,try Again!"); 
		
		

	}

}
