package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] teams = new String [2][6];
		teams [0][0] = "Nimo";
		teams [0][1] = "Zarah";
		teams [0][2] = "Warah ";
		teams [0][3] = "Ikram";
		teams [0][4] = "Hiba";
		teams [0][5] = "Ayan";
		
		
		teams [1][0] = "Abdi";
		teams [1][1] = "Ahmed";
		teams [1][2] = "Ali";
		teams [1][3] = "Hassan";
		teams [1][4] = "Farah";
		teams [1][5] =  "Osman";
		
		System.out.println("Frist player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		System.out.println(teams[1][5]);
		
		System.out.println("Numbers of rows: " + teams.length);
		System.out.println("People of in first team: " + teams [0].length);
		System.out.println("People of in first team: "+ teams[1].length );
		
		System.out.println(Arrays.deepToString(teams));
	
		int [][] nums = new int[3][4];
		nums [0][0] = 100;
		nums [0][1] = 32456;
		nums [0][2] = 7643;
		nums [0][3] = 7638;
		nums [1][0] = 1234;
		nums [1][1] = 7028;
		nums [1][2] = 92939;
		nums [1][3] = 76252;
		nums [2][0] = 38494;
		nums [2][1] = 9870;
		nums [2][2] = 1234;
		nums [2][3] = 5439;
		
		System.out.println(Arrays.deepToString(nums));
		
		System.out.println(Arrays.toString(nums[0]));
		
		int[][] scores = {{3,5,10} , {6,4,2}};
		
		System.out.println("Days played/Number of arrays:" + scores.length);
		System.out.println("Number of values in 1:" + scores[0].length);
		System.out.println("Number of values in 2:" + scores[1].length);
		
		
		int [][] values = new int[4][];
		values[0] = new int[]{34,23,5};
		values[1] = new int[]{34,23,5};
		values[2] = new int[]{34,23,5,56,88,55,57,56};
		
		
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
		
		values[3] = new int[] {5,12,45,77,34};
		


		
		
	}

	}


