package Practice;

import java.util.Scanner;

public class InputandOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("hello " + name);
		
		String string = new String("This is a string");
		System.out.println(string + ":)");
		
		
	}
	

}
