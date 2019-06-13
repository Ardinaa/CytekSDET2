package day18_loops2;

public class Print0to10 {
	public static void main(String[] args) {
		/*
		 0
		 1
		 2
		 ..
		 100
		 */
		//0 --- 100
	
		int counter = 0;
		       //101
		while( counter <= 100 ) {
			System.out.println(counter);
			counter++;//counter = counter+1;
		}
		
		System.out.println("Counter:" + counter);
		
	}
}
