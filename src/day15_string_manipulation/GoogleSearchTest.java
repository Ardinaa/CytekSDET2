package day15_string_manipulation;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item = "java";
		String pageTitle = item + " - Google Search";
	//test if pageTitle starts with item 
		if (pageTitle.startsWith(1
				+item)) {
			System.out.println("PASS: Page title check passed");
		}else {
			System.out.println("FAIL: Page title check failed");
		}

		if(pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google search is in title");
			System.out.println("FAIL: Google search is not in title ");
		}
		
		
		
		
		
		
	}

}


