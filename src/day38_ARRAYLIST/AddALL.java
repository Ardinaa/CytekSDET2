package day38_ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

public class AddALL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		l1.add("java");
		l1.add("python");
		
		List<String>l2 = new ArrayList<>();
		l2.add("C#");
		l2.add("C++");

		System.out.println(l1);
		System.out.println(l2);
		
		l2.addAll(l1);
		System.out.println(l2);
		
	}

}
