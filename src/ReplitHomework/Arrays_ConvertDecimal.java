package ReplitHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ConvertDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    int[] binary = new int[8];
		    
		    //TODO: Write your code below.
		    
		    int [] num1 = new int [8];
		 		int num = 3;
		 		int num2 = 0;
		 		
		 		String strBinary = Integer.toBinaryString(num2);
		 		int numBinary = Integer.parseInt(strBinary);
		 		System.out.println(numBinary);
		 		for(int i = num1.length-1; i >=0; i--) {
		 			num1 [i] = numBinary%10;
		 			
		 			numBinary = numBinary/10;
		 		}
		 		System.out.println(Arrays.toString(num1));
				
						






		    
		    
		    
		    
		    
		    
		    
		  }
		}