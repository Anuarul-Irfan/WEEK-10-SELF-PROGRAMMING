package week10;

import java.util.Scanner;
public class Self8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
        int[] a1 = new int[4];
        int row = 2;
        int col = 3;
        int[][] b = new int[row][col];
        
        System.out.println("Enter six number");
        for (int i=0; i<row; i++)
            for (int j=0; j<col; j++)
                b[i][j] = sc.nextInt();
        
        for (int i=0; i<row; i++)
            for (int j=0; j<col; j++)
                System.out.println("Row = " + i + " " + "col = " + j + " " + b[i][j]);
		
		System.out.println("Enter five number for row a");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		
		System.out.println("Enter five number for row a1");
		for (int i = 0; i < a1.length; i++)
			a1[i] = sc.nextInt();
		
		for (int i = 0; i < a.length; i++)
			System.out.println("Row a = "+a[i]);
			
			System.out.println("Row a1 = "+a[i]);
		for (int i = 0; i < a.length; i++)
		

	}

}
