package day38_ARRAYLIST;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> months = new ArrayList<>(list1);
		System.out.println(months);
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months.contains("Jan"));
	}

}
