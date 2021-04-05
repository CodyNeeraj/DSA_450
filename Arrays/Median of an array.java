// Java program to find number of operations
// to make an array palindrome
import java.util.*;
public class median
{
	// Returns minimum number of count operations
	// required to make arr[] palindrome
	static int findMinOps(int[] arr, int n)
	{
        int m,left=0,right=n-1;
        if(n%2==0)
    	{
			//m=(arr[n/2-1]+arr[n/2])/2;
    		m=n/2;
			 left = arr[m-1];
			 right=arr[m];
    		int result= (left + right) /2;
    		System.out.println("Even set of numbers");
        	return result;
    	}
    	else
    	{
    		m=left+(right-left)/2;
    		System.out.println("Odd set of numbers");
    		return arr[m];
        }      
    }
    // Driver method to test the above function
	public static void main(String[] args)
	{
		int arr[] = new int[]{1, 12, 15, 26, 38,2, 13, 17, 30, 45} ;
		System.out.println("Array we have is        "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sorting is: "+Arrays.toString(arr));
		System.out.println("the median of above array is "+
								findMinOps(arr, arr.length));
	}
}