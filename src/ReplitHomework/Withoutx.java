package ReplitHomework;

import java.util.Scanner;

public class Withoutx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    
	    
	    
		if(word.startsWith("x") || word.startsWith("X")) {
			
			word = word.replaceFirst ("x" ," ");
			word = word.replaceFirst ("X" ," ");
			
		}
		
	
		if(word.endsWith("x") || word.endsWith("X")) {
			
		
		word = word.substring(0, word.length()-1);
		
		}
		System.out.println(word);
	}

}
