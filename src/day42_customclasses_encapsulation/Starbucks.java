package day42_customclasses_encapsulation;

public class Starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee[] coffeeArray = new Coffee[2];
		coffeeArray [0] = new Coffee();
		coffeeArray [0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
		coffeeArray [0].getCoffeeInfo();
		
		Coffee latte = new Coffee();
		
		latte.setCoffeeInfo("CAFE LATTE","Grande", 3.85,190);
		coffeeArray [1] = latte;
		
		
	}

}
