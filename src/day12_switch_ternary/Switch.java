package day12_switch_ternary;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 1;
        switch (score) {
        case 1:
        System.out.println("Score is 1");
        break;  // exit switch statement
        case 2:
        System.out.println("Score is 2");
        break; 
        case 3:
        System.out.println("Score is 3");
        
        default:
			System.out.println("Invalid score");
			break; //works without this as well.
        
        }

	}

}
