package day25_Arrays;

public class population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] population = new int[5];
		
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;
		
		// int[] population = {5000, 10000, 7000, 4455, 8907};
		int[] population2 = {5000, 5000 * 2, 7000, 4455, 8907};
		
		
		System.out.println("City 0 population:" + population[0]);
		
		System.out.println("City 1 population:" + population[1]);
		System.out.println("City 2 population:" + population[2]);
		System.out.println("City 3 population:" + population[3]);
		System.out.println("City 4 population:" + population[4]);
		
		
		
		
	}
}

