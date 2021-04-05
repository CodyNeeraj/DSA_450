/* // Implementation with two pointer algo
import java.io.*;

class swap 
{
	public static void RearrangePosNeg(int arr[])
	{
		int i=0;
		int j=arr.length-1;
		while(true)
		{
			// Loop until arr[i] < 0 and 
			// still inside the array
			while(arr[i]<0 && i<arr.length)
			i++;
		
			// Loop until arr[j] > 0 and 
			// still inside the array
			while(arr[j]>0 && j>=0)
			j--;
		
			// if i is less than j
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else
			break;
		}
	} 

	// Driver Code
	public static void main (String[] args) 
	{
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		RearrangePosNeg(arr);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}*/
 
 
 
 // Java program to Rearrange positive
// and negative numbers in a array
import java.io.*;

class swap {
	// A utility function to print
	// an array of size n
	static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Function to Rearrange positive and negative
	// numbers in a array
	static void RearrangePosNeg(int arr[], int n)
	{
		int key, j;
		for (int i = 1; i < n; i++) {
			key = arr[i];

			// if current element is positive
			// do nothing
			if (key > 0)
				continue;

			/*if current element is negative,
			shift positive elements of arr[0..i-1],
			to one position to their right */
			j = i - 1;
			while (j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			// Put negative element at its right position
			arr[j + 1] = key;
		}
	}

	// Driver program
	public static void main(String[] args)
	{
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int n = arr.length;
		RearrangePosNeg(arr, n);
		printArray(arr, n);
	}
}


