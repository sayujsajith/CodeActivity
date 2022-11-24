package com.ThursdayActivityQues2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class LongestWord {

	
	public String findLongestWord() throws FileNotFoundException {
		String Longest_word=" ";
		String current;
		Scanner sc=new Scanner(new File("C:\\Users\\vishn\\Downloads\\sts-4.16.1.RELEASE"));
		while(sc.hasNext()) {
			current=sc.next();
			if(current.length() > Longest_word.length()) {
				Longest_word = current; 
			}
				
		}
		System.out.println(Longest_word);
		return Longest_word;
		
		
		
	} 
}
		

	


