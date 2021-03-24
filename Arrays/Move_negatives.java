import java.util.*;
class move_negatives
{
	public static void main(String args[])
	{
		int temp,j=0;
		int arr []= {-1,-2,-3,4,5,8,7,0,98,-8,-97};
		//			  0  1  2 3 4 5 6 7 8   9  10
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nThe length of the array is "+(arr.length));
	}
}
		