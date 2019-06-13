package day42_customclasses_encapsulation;

public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String data = "Bruno Magli, 9.5";
			String[] arrData = data.split(",");
			Shoes shoes = new Shoes ();
			shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
			
	}

}
