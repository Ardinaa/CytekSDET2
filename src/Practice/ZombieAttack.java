package Practice;

import java.util.Arrays;

public class ZombieAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		
			int [] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
			
		    int max = Integer.MIN_VALUE;
		    int maxPosition = 0;
		    int dayCounter = 0;
		    
		    for (int i = 0; i < inhabitants.length; i++) {
		    	if (inhabitants[i] > max) {
		    		max = inhabitants[i];
		    		maxPosition = i; 
		    	}
		    	
		    }
		   
		do {
			
			System.out.println("Day " + dayCounter++ + " " + Arrays.toString(inhabitants));
			for (int j =0; j <  inhabitants.length; j++) {
				 inhabitants[j] =  inhabitants [j] / 2;
			}
			
		} while (inhabitants[maxPosition] > 0);
		 
			
	
		
	}

}
