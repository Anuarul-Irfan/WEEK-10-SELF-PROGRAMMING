package selfProgramming;

import java.util.Scanner;
public class Self7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int largest;
		int row;
		int col;
		int matrix[][] = new int[5][5];
		
		for (row = 0; row < matrix.length; row++)
			  for (col = 0; col < matrix[row].length; col++)
			   matrix[row][col] = scan.nextInt();
		
		for (row = 0; row < matrix.length; row++)
		{
		  largest = matrix[row][0];
		  for (col = 1; col < matrix[row].length; col++)
			if (largest < matrix[row][col])
			largest = matrix[row][col];
		  System.out.println("The largest element of row" + (row+1) + " = " + largest);

		                 

	}

}
}
