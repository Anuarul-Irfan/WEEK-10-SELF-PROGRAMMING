package selfProgramming;

public class Self6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int col;
		int matrix[][] = new int[7][6];
		
		for (row = 0; row < matrix.length; row++)
		    for (col = 0; col < matrix[row].length; col++)
		    	matrix[row][col] = 10;	

		for (row = 0; row < matrix.length; row++)
		{
		    for ( col = 0; col < matrix[row].length; col++)
			System.out.println(matrix[row][col]);
			 System.out.println();
		}

	}

}
