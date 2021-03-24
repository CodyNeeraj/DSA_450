import java.util.*;
class contg_subarr
{
	public static void main(String args[])
	{
		int arr[]= 
		{
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97,
			-1,-2,-3,4,5,8,7,0,98,-8,-97
		};
		//if the array is duplicated && not  sorted at the same time then we must have to first sort it !
		Arrays.sort(arr);
		int max_total= Integer.MIN_VALUE , max_limit_pointer=0;
		for(int i=0;i<arr.length;i++)
		{
			max_limit_pointer  += arr[i];
			if(max_total < max_limit_pointer)
			{
				max_total = max_limit_pointer;
			}
			if(max_limit_pointer < 0)
			{
				max_limit_pointer = 0;
			}
		}
		System.out.println("The max contagious sum sub array of array "+Arrays.toString(arr)+" is \n"+max_total);
		
	}
}