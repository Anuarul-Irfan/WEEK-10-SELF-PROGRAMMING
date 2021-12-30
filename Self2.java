package selfProgramming;

import java.util.Scanner;

public class Self2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][] sales = new int [3][3];
		
		System.out.println("Enter sales number ");
		for (int i = 0; i < sales.length; i++)  
			for (int y = 0; y < sales.length; y++)
				sales [i][y] = sc.nextInt();
		
		for (int i = 0; i < sales.length; i++) { 
			for (int y = 0; y < sales.length; y++) {
				
				System.out.println("i = "+i+" y = "+y);
				System.out.println("Values for sales is "+sales[i][y]);

			}
		}
	}

}
