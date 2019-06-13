package day29_methods01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countriesArray = 
 
			{
					{"USA","Washington DC"},
					{"Canada", 	"Ottawa"},
					{"Mexico","Mexico city"},
					{"Brasil","Brasilia"},
					{"Peru", "Lima"},
					{"Argentina", "Boanes Aeros"},
					{"Bolivia","La Paz"},
					{"Macedonia","Scopia"},
					{"Kazakhstann","Nursultan"}
					
			};
		System.out.println(countriesArray[0][0] +"|"+countriesArray[0][1] ); 
		System.out.println(countriesArray[8][0] +"|"+countriesArray[8][1] ); 
		System.out.println(Arrays.deepToString(countriesArray));
		
		for(int i = 0; i < countriesArray.length; i++) {
			System.out.println(countriesArray[i][0] + "|");
			
		}
		System.out.println();
		for(String[] country : countriesArray) {
			System.out.println(country[0] + "|");
		}
				}

			}