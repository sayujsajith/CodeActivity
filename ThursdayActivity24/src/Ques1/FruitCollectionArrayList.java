package Ques1;
import java.util.*;

public class FruitCollectionArrayList {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();
		  al.add("WaterMelon");
		  al.add("Orange");
		  al.add("Kiwi");
		  al.add("Banana");
		  al.add("Mango");
		  System.out.println("Fruits in the basket is :"+al);
		
		  System.out.println("");
		  ArrayList<String> al1=new ArrayList<String>();
		  al1.addAll(al);
		  al1.add("Guava");
		  al1.add("Dragon Fruit");
		  System.out.println("After adding new Fruits is:"+al1);
		 
		  System.out.println("");
		  al.remove(al1);
		  System.out.println("After Removing"+al);
		  System.out.println("");
		 
		  al.set(3, "Strawberry");
		  System.out.println("After Replacing:"+al);
		

	}

}
