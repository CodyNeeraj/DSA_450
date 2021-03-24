import java.util.*;
class union_int
{
	public static void main(String args[])
	{
		//this program will only work with Sorted arrays and using it with another type of input may cause inappropriate results !
		int arr1[]= {123,547,6,5,8,65,78};
		int arr2[]= {56,45,65,6,87,9,789,79847};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Union is said to be the all elements from the above two arrays (neglecting) duplicates
		//Intersection is said to be only the twin elements present in another array wrt to first one (not counting unique elements)
		System.out.println("The union of the array is :\n");
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i++]+" ");
			}
			else if(arr2[j]<arr1[i])
			{
				System.out.print(arr2[j++]+" ");
			}
			else
			{
				System.out.print(arr2[j++]+" ");
				i++;
			}	
		}
		if(i<arr1.length)
		{
			while(i<arr1.length)
			{
				System.out.print(arr1[i++]+" ");
			}
		}
		else if(j<arr2.length)
		{
			while(j<arr2.length)
			{
				System.out.print(arr2[j++]+" ");
			}
		}
		i=0; j=0;
		System.out.println("\nThe Intersection of the array is :\n");
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				j++;
			}
			else
			{
				System.out.print(arr2[j++]+" ");
				i++;
			}
		}
	}
}