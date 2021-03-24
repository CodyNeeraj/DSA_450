// Java program to find whether an array
// is subset of another array

class GFG {

	/* Return true if arr2[] is a subset 
	of arr1[] */
	static boolean isSubset(int arr1[],	int arr2[],	int m, int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

			/* If the above inner loop was not broken at all then arr2[i] is not present in	arr1[] */
			if (j == m)
				return false;
		}

		/* If we reach here then all elements of arr2[] are present in arr1[] */
		return true;
	}

	// Driver code
	public static void main(String args[])
	{
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is "+ "subset of arr1[] ");
		else
			System.out.print("arr2[] is "+ "not a subset of arr1[]");
	}

/* Another approach
// Java code to find whether an array is subset of another array
import java.util.HashSet;
class GFG 
{
	// Return true if arr2[] is a subset of arr1[] 
	static boolean isSubset(int arr1[],int arr2[], int m, int n)
	{
		HashSet<Integer> hset = new HashSet<>();

		// hset stores all the values of arr1
		for (int i = 0; i < m; i++)
		{
			if (!hset.contains(arr1[i]))
				hset.add(arr1[i]);
		}

		// loop to check if all elements
		// of arr2 also lies in arr1
		for (int i = 0; i < n; i++) 
		{
			if (!hset.contains(arr2[i]))
				return false;
		}
		return true;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.println("arr2 is a subset of arr1");
		else
			System.out.println("arr2 is not a subset of arr1");
	}
}
// This code is contributed by Kamal Rawal
 */

/*Another approach using Hashset
import java.io.*;
import java.util.*;

class GFG
{
	public static void main (String[] args) 
	{

		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };
		int m=arr1.length;
		int n=arr2.length;

		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < m; i++)
		{
			s.add(arr1[i]);
		}
		int p = s.size();
		for (int i = 0; i < n; i++)
		{
			s.add(arr2[i]);
		}

		if (s.size() == p)
		{
			System.out.println("arr2[] is subset of arr1[] " + "\n");
		}
		else
		{
			System.out.println("arr2[] is not subset of arr1[] " + "\n" );
		}
	}
}

// This code is contributed by avanitrachhadiya2155

*/
