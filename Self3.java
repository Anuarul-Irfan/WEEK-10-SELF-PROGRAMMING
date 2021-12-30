package selfProgramming;

import java.util.Scanner;

public class Self3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name [] = new String [5];
		int sum = 0;
		int num [] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 names : ");
		for (int i = 0; i < name.length; i++) {
			name [i] = sc.next();
		}
		for (int i = 0; i < name.length; i++)
			System.out.println("The names are " + "name" + i +" = "+ name[i]);
	}


	}
