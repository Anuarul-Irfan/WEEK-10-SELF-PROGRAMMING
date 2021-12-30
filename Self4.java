package selfProgramming;

import java.util.Scanner;

public class Self4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int item0, item1, item2, item3, item4;
		 	int item [] = new int[5];
		    int sum =0;
		    Scanner input = new Scanner(System.in);
		 
		    System.out.println("Enter five integers one number per line");
		    for (int i = 0; i < item.length; i++) {
		    	item[i] = input.nextInt();
		    	sum = sum + item[i];
		    }
		    System.out.println("Sum is: "+sum);
		    System.out.println("Average is: "+sum/item.length);
		    
	}

	

}
