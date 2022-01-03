package week10;

import java.util.Scanner;
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = new int[4];
	        int[] a1 = new int[4];
	        
	        int row = 2;  // can change to 31 days or 2 or any numbers
	        int col = 4;  // can change to 12 months or 3 or any numbers
	        int[][] b = new int[row][col];
	        
	        int sum;
	        int totalSum;
	        
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter eight number / data");
	        totalSum = 0;
	        for (int i = 0; i < row; i++) {
	            sum = 0;
	            for (int j = 0; j < col; j++) {
	                b[i][j] = input.nextInt();  // i for row and j for column
	                sum = sum + b[i][j];
	            }
	            System.out.println("Sum = " + sum);
	            totalSum = totalSum + sum;
	            System.out.println("Total Sum = " + totalSum);
	        }
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++)
	                System.out.println("Row = " + i + " " + "Col = " + j + " " + b[i][j]);
	        }

	}

}
