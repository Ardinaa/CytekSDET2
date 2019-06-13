package Practice;

public class ArrayWithNestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		int[]nums=new int[]{1,2,3,4,2,3,4,44,12,20,100,33,100,4};
		
		for (int outer=0; outer<nums.length;outer++) {
			int currentNum=nums[outer];
			boolean dublicate=false;
			for (int inner=0; inner<nums.length;inner++) {
				if(nums[inner]==currentNum && inner !=outer) {
					dublicate=true;
					break;
					
				}
				
			}
			if (dublicate==false) {
				System.out.println(currentNum+" ");
		}
		}
	}

}
