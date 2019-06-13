package Practice;

public class NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bill=2000;
		int quantity= 15;
		int discountpercent=0;
		
		if(bill>1000) {
			if(quantity>11) {
				discountpercent=10;
			}else {
				discountpercent=9;
			}
		}else {
			quantity=5;
			
		}
		System.out.println(discountpercent);
		
		int discount= (bill>1000) ? (quantity>11)? 10:9:5;
		
			
				
	}
	
	
	
	
	

}
