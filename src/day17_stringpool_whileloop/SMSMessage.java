package day17_stringpool_whileloop;
import java.util.*;
public class SMSMessage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//74 Rep
		    Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		   
		    
		    
		    String sender = message.substring( message.indexOf("<")+1 , message.indexOf(">"));
		    System.out.println("Sender" + sender);
		    String phoneNumber = message.substring( message.indexOf("[")+1 , message.indexOf("]"));
		    System.out.println("Phone Number" + phoneNumber);
		    String messageBody = message.substring( message.indexOf("{")+1 , message.indexOf("}"));
		    System.out.println("Message Body" + messageBody);
		    
		
	}

}
