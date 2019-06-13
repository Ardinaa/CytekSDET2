package Practice;

import java.util.Arrays;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] binary = new int [8];
 		int num = 3;
 		int decimal = 0;
 		
 		String strBinary = Integer.toBinaryString(decimal);
 		int numBinary = Integer.parseInt(strBinary);
 		System.out.println(numBinary);
 		for(int i = binary.length-1; i >=0; i--) {
 			binary [i] = numBinary%10;
 			
 			numBinary = numBinary/10;
 		}
 		System.out.println(Arrays.toString(binary));
		
			

	}

}
