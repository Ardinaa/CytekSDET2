package day08_casting_conditionals;

public class Explicit {
	public static void main(String[] args) {
		
		System.out.println( 10 / 2.0 ); //result is double
		System.out.println( 10.0 / 2 );
		
		int result = (int)(10 / 2.0);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		//double average = (rent1+rent2+rent3+rent4) / 4;
		double average = (double)(rent1+rent2+rent3+rent4) / 4;
		System.out.println(average);
		
		double d = 40.2;
		int i = (byte)d; 
		//in above statement both explicit and implicit casting happening.
		
		//explicit: double > byte, 
		//implicit: byte > int
		
		System.out.println('a' + 1);
		
		char ch = 98;
		System.out.println(ch);
	}
	

}
