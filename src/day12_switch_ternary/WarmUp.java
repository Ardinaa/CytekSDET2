package day12_switch_ternary;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 100;
		int n2 = 55;
		int n3 = 10;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("n1 is bigger");
		}else if (n2 >  n1 && n2 > n3) {
			System.out.println("n2 is bigger");
		}else {
			System.out.println("n3 is bigger");
		}
	}

}
