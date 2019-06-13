package ReplitHomework;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	  
	  if (email.contains("_")){
	  } 
	  
	    String firstName = email.substring(0  , email.indexOf("_"));
	    System.out.println("First name: "+ firstName.substring(0,1) + firstName.substring(1));
	    
	    String lastName = email.substring( email.indexOf ("_")-1  , email.indexOf("@"));
	    System.out.println("Last name: "+  lastName.substring(0,1) + lastName.substring(1));
	    
	    
	  
	}

}
