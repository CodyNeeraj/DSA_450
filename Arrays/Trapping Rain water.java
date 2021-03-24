// C++ implementation of the approach
#include<iostream>
using namespace std;

// Function to return the maximum water that can be stored
int maxWater(int arr[], int n)
{
	int size = n - 1;

	// Let the first element be stored as previous, we shall loop from index 1
	int prev = arr[0];

	// To store previous wall's index
	int prev_index = 0;
	int water = 0;

	// To store the water until a larger wall is found, if there are no larger walls then delete temp value from water
	int temp = 0;
	for(int i = 1; i <= size; i++)
	{

		// If the current wall is taller than the previous wall then make current wall as the previous wall and its index as previous wall index for the subsequent loops
		if (arr[i] >= prev) 
		{
			prev = arr[i];
			prev_index = i;

			// Because larger or same height wall is found
			temp = 0;
		} 
		else
		{
			// Since current wall is shorter thanthe previous, we subtract previous wall's height from the current wall'sheight and add it to the water
			water += prev - arr[i];

			// Store the same value in temp as well If we dont find any larger wall then we will subtract temp from water
			temp += prev - arr[i];
		}
	}

	// If the last wall was larger than or equalto the previous wall then prev_index wouldbe equal to size of the array (last element)If we didn't find a wall greater than or equalto the previous wall from the left thenprev_index must be less than the indexof the last element
	if(prev_index < size) 
	{

		// Temp would've stored the water collectedfrom previous largest wall till the endof array if no larger wall was found thenit has excess water and remove thatfrom water variable
		water -= temp;

		// We start from the end of the array, so previous should be assigned tothe last element
		prev = arr[size];

		// Loop from the end of array up to the previous index which would containthe largest wall from the left
		for(int i = size; i >= prev_index; i--) 
		{
			// Right end wall will be definitely smaller than the 'previous index' wall
			if(arr[i] >= prev)
			{
				prev = arr[i];
			} 
			else
			{
				water += prev - arr[i];
			}
		}
	}

	// Return the maximum water
	return water;
}

// Driver Code
int main()
{
	int arr[] = { 0, 1, 0, 2, 1, 0, 
				1, 3, 2, 1, 2, 1 }; 
	int n = sizeof(arr) / sizeof(arr[0]);

	cout << maxWater(arr, n);
	return 0;
}


/*
// JAVA Code For Trapping Rain Water
import java.util.*;

class GFG {

	static int findWater(int arr[], int n)
	{
		// initialize output
		int result = 0;

		// maximum element on left and right
		int left_max = 0, right_max = 0;

		// indices to traverse the array
		int lo = 0, hi = n - 1;

		while (lo <= hi) {
			if (arr[lo] < arr[hi]) {
				if (arr[lo] > left_max)

					// update max in left
					left_max = arr[lo];
				else

					// water on curr element =
					// max - curr
					result += left_max - arr[lo];
				lo++;
			}
			else {
				if (arr[hi] > right_max)

					// update right maximum
					right_max = arr[hi];

				else
					result += right_max - arr[hi];
				hi--;
			}
		}

		return result;
	}

	// Driver program to test above function 
	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 0, 2, 1, 0, 1,
					3, 2, 1, 2, 1 };
		int n = arr.length;

		System.out.println("Maximum water that "
						+ "can be accumulated is "
						+ findWater(arr, n));
	}
}


*/
