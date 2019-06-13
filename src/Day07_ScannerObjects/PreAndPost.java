package Day07_ScannerObjects;

public class PreAndPost {
	public static void main(String[] args) {
	
		int num = 0;
		int num2 = num++;
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);

		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
		 
		int friends = 10;
		System.out.println(friends++);
		System.out.println(friends);
//========================================================
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries ++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);//9
		System.out.println("oldBatteries: " + totalBatteries);//14
		System.out.println("totalBatteries: " + totalBatteries);//14
		
		
		
	}

}
