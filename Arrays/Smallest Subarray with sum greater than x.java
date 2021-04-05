// O(n) solution for finding smallest subarray with sum
// greater than x

public class SmallestSubArraySum {
	// Returns length of smallest subarray with sum greater
	// than x. If there is no subarray with given sum, then
	// returns n+1
	static int smallestSubWithSum(int arr[], int n, int x)
	{
		// Initialize current sum and minimum length
		int curr_sum = 0, min_len = n + 1;

		// Initialize starting and ending indexes
		int start = 0, end = 0;
		while (end < n) {
			// Keep adding array elements while current sum
			// is smaller than or equal to x
			while (curr_sum <= x && end < n)
				curr_sum += arr[end++];
				

			// If current sum becomes greater than x.
			while (curr_sum > x && start < n) {
				// Update minimum length if needed
				if ( min_len > end - start)
					min_len = end - start;

				// remove starting elements
				curr_sum -= arr[start++];
			}
		}
		return min_len;
	}
	// Driver program to test above functions
	public static void main(String[] args)
	{
	

		int arr3[]
			= { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
		int n3 = arr3.length;
		int x = 280;
		int res3 = smallestSubWithSum(arr3, n3, x);
		if (res3 == n3 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res3);
	}
}

