package Day07_ScannerObjects;

public class PreandPost2 {

	public static void main(String[] args) {
		int messages = 10;
		messages++; //11
		++messages;//12
		System.out.println("Messges: " + messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messgaes: " + messages);

		
		
		int unreadMessages =readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMewssages: " + readMessages);
		
		
		int count = 20;
		int count2 = 10;
		
		int totalCount = ++count + --count2;
	
		System.out.println("count: " +count);
		System.out.println("count2: " + count2);
		System.out.println("totalCount: " + totalCount);
		
		
		
		
		
		
		
	}

}

 