package selfProgramming;

import java.util.Scanner;
public class Self1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item0, item1, item2, item3, item4;
		int sum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five integers one number per line");
			
		item0 = input.nextInt();
		item1 = input.nextInt(); 	
	         item2 = input.nextInt();
		item3 = input.nextInt();
		item4 = input.nextInt();
			
		sum = item0 + item1 + item2 + item3 + item4;
			
		System.out.println("The sum of the numbers = " + sum);
		System.out.println("The numbers in reverse order are: ");
		System.out.println(item4 + " " + item3 + " " + item2 + " " + item1 + " " + item0);


	}

}
