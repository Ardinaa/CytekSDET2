package day27_array05;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int[] nums = {43, 12, 4, 1, 3,5};
		
		//toString method
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println();
		String str = Arrays.toString(nums);
		
		System.out.println(str);
		
		System.out.println();
		// sort method: - sorts arrays in ascending order 
		
		Arrays.sort(nums);
		

		System.out.println(Arrays.toString(nums));
		
		System.out.println();
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
		System.out.println(Arrays.toString(languages));
		
		System.out.println();
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));

		
		
		
		
		
		
	}

}
