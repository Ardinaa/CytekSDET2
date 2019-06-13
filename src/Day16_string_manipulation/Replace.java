package Day16_string_manipulation;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String sentence = "Coding is fun, it is my hobby!!";
			String withNoSpaces = sentence.replace(" ", "");
			System.out.println(withNoSpaces);
			
			System.out.println(sentence);
			//replace , with !!!
			sentence = sentence.replace("," , "!!!");
			System.out.println(sentence);
			
			String mixed = "&^@#j$a-v|a@#$";
			//clean up mixed
			mixed = mixed.replace("&^@#", "");
			System.out.println(mixed);
			mixed = mixed.replace("@#$", "");
			System.out.println(mixed);//j$a-v|a
			
			mixed = mixed.replace("$", "");
			mixed = mixed.replace("-", "");
			mixed = mixed.replace("|", "");
			//mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
			System.out.println(mixed);
			
			mixed = mixed.replace("a", "");
			System.out.println(mixed);
		}
	}





	
