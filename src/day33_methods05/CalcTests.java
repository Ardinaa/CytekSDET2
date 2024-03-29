package day33_methods05;

import day31_methods02.Calculator;

public class CalcTests {
	public static void main(String[] args) {
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.minus(40, 12));
		System.out.println(Calculator.divide(100, 2));
		
		double addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 40);
		double miResult = Calculator.minus(3000, 200);
		double dResult = Calculator.divide(455, 5);
		
		System.out.println("addResult: "+addResult);
		System.out.println("mResult: "+mResult);
		System.out.println("miResult: "+miResult);
		System.out.println("dResult: "+dResult);
		
		double a = 10.0, b = 5.0;
		double myResult = Calculator.minus(a, b);
		System.out.println("myResult: " + myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);
		                //26
		if(Calculator.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");
		}else{
			System.out.println("Add Unit test failed");
		}
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
		
	}
}
