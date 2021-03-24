import java.util.*;
class dutch_flag
{
	public static void main(String args[])
	{
		int arr[]= {0,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,210,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,1,2,0,2,1,10,1,0,2,1,0,0,2,2,2,2,2,1,1,1,1,0,10,1,0,2,1,0,0,2,2};
		System.out.println("The array we given is ;");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("the length of the array is "+arr.length);
		int i , cnt0=0, cnt1=0, cnt2=0;
		for(i=0;i<arr.length;i++)
		{
			switch(arr[i])
			{
				case 0:
					cnt0++;
					break;
				case 1:
					cnt1++;
					break;
				case 2:
					cnt2++;
					break;
			}
		}
		System.out.println("The number of\n0's is "+cnt0+"\n1's are "+cnt1+"\n2's are "+cnt2);
			i=0;//updation is necessary as if not doing this will cause array index to be out of bound
			
			 /* starting from index 0 as specified above, hte 3 while loops are arranged in such an order that first array got filled with 0then  1 and last with 2 since the above working of the working is sequential we can also use it to sort the array of diffrent kinds of digits specified they must be unique or self repetiting and the then the part of code in firstly needed to addition of Switch cases statement for different inputs and also same for the while loop too */
			 
			while(cnt0 > 0)
			{
				arr[i++]=0;
				cnt0--;
			}
			
			while(cnt1 > 0)
			{
				arr[i++]=1;
				cnt1--;
			}
			
			while(cnt2 > 0)
			{
				arr[i++]=2;
				cnt2--;
			}
			
			System.out.println("The sorted array is ;");
			
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[j]);
			}
		
	}
}