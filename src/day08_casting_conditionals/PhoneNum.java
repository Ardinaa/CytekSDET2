package day08_casting_conditionals;

import java.util.*;

public class PhoneNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your area code:");
		int areaCode = scan.nextInt();
		
		System.out.println("Enter your area code:");
		int localNumber = scan.nextInt();
		//303-2367890
		
		String phoneNumber = "(" + areaCode+")-" +localNumber;
		
		System.out.println("Calling number " + phoneNumber);
	}

}
