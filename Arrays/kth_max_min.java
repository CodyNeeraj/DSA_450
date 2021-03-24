import java.util.*;
public class kth_max_min
{
	public static void main(String args[])
	{
		int arr[]= {135,87,8,856,48,489,568,845};
		System.out.println("The array we given is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("\n\nThe Modified array is :");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}
		int k_min=3,k_max=6;
		System.out.println("\n\nThe value of K(smallest) is "+k_min+(" and k(Largest) is "+k_max));
		
		int min= arr[k_min - 1], max= arr[k_max - 1];//actual code
		
		System.out.println("So the value of "+k_min+" small is "+min+" and "+k_max+" largest is "+max);		
	}
}