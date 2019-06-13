package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertingDecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int decimal=input.nextInt();
		
		int[] binary = new int[8];
		
		binary[7]=decimal%2==0 ? 0:1;
		int division=decimal/2;
		binary[6]=decimal%2==0 ? 0:1;
		int division1=division/2;
		binary[5]=decimal%2==0 ? 0:1;
		int division2=division1/2;
		binary[4]=decimal%2==0 ? 0:1;
		int division3=division2/2;
		binary[3]=decimal%2==0 ? 0:1;
		int division4=division3/2;
		binary[2]=decimal%2==0 ? 0:1;
		int division5=division4/2;
		binary[1]=decimal%2==0 ? 0:1;
		int division6=division5/2;
		binary[0]=decimal%2==0 ? 0:1;
			for(int num: binary) {
				System.out.println(Arrays.toString(binary));
				break;
				
			}
		
		
	}

}