package day27_array05;

public class tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Java --> programming language
		Selenium --> Test Automation
		TestNG --> Testing tool
		JUnit --> Testing tool
		Cucumber --> BDD Style testing
		Git --> Version control
		Maven --> Building and execution for project
		 */
		
	   String[] tools = {"JAVA","Selenium","TestNG",
			            "JUnit","Cucumber","Git","Maven"};
	   
	   for(String tool : tools) {
		   switch(tool.toLowerCase()) {
		   case "java":
			   System.out.println("Java --> programming language");
			   break;
		   case "selenium":
			   System.out.println("Selenium --> Test Automation");
			   break;
		   case "testng":
		   case "junit":
			   System.out.println(tool+" --> Testing tool");
			   break;
		   case "cucumber":
			   System.out.println("Cucumber --> BDD Style testing");
			   break;
		   case "git":
			   System.out.println("Git --> Version control");
			   break;
		   case "maven":
			   System.out.println("Maven --> Building and execution for project");
			   break;
		   default:
			   System.out.println("Unknown tool");
			   
		   }
	   }
	

	}
}
