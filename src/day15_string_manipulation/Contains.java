package day15_string_manipulation;
import java.util.*;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "test@gmail.com";
		System.out.println( email.contains("@"));
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, creal, meat" ;
		

		if(list.contains("applees")) {
			System.out.println("Apples are there!");
		}else {
		System.out.println("Lets Add apples now!");
		
		}
		boolean hasEggs = list.contains("eggs");
		 System.out.println("Contians eggs: " + hasEggs);
		 
		 
		
	}
	

} 
