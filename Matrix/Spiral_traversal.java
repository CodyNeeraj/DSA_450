// Java program to print a given matrix in spiral form
import java.io.*;
public class GFG {
	// Function print matrix in spiral form
	static void spiralPrint(int endRow, int endCol, int a[][])
	{
		int i, startRow = 0, startCol = 0;
		while (startRow < endRow && startCol < endCol) 
		{
			// Print the first row from the given remaining rows
			for (i = startCol; i < endCol; ++i)
			{
				System.out.print(a[startRow][i] + " ");
			}
			startRow++;
			
			// Print the last column from all the remaining columns
			for (i = startRow; i < endRow; ++i) 
			{
				System.out.print(a[i][endCol - 1] + " ");
			}
			endCol--;
			// Print the last row from the remaining rows */
			if (startRow < endRow) 
			{
				for (i = endCol - 1; i >= startCol; --i)
				{
					System.out.print(a[endRow - 1][i] + " ");
				}
				endRow--;
			}
			// Print the first column from the remaining
			// columns */
			if (startCol < endCol) 
			{
				for (i = endRow - 1; i >= startRow; --i) 
				{
					System.out.print(a[i][startCol] + " ");
				}
				startCol++;
			}
		}
	}
	// Driver Code
	public static void main(String[] args)
	{
		int R = 3;
		int C = 6;
		int a[][] = { 
            		      { 1, 2, 3, 4, 5, 6 },
            			 { 7, 8, 9, 10, 11, 12 },
            			{ 13, 14, 15, 16, 17, 18 }
					};
		// Function Call
		spiralPrint(R, C, a);
	}
}