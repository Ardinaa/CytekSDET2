package Practice;

import java.util.Scanner;

public class CharAt {

		public static void main(String[] args) {
			String str = new Scanner(System.in).nextLine();
			// count the number of times k appears in a string
			// input: khlsbfvkdm
			// output: 2
			// count the number of times "food" appears in a string
			// input: "javaxfoodkelp"
			// output: 1
			
			int numberOfFoods = 0;
			for (int i = 0; i < str.length()-4; i++) {
				if (str.substring(i, i+4).equals("food")) {
					numberOfFoods++;
				}
				System.out.println(str.substring(i, i+4));
			}
			System.out.println(numberOfFoods);
			
		}
}
