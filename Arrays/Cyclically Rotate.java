import java.util.*;
class cyc_rotate
{
	//Cyclic Roation means to rotate the given number of elements as specified(Clockwise or counter-clockwise)
	//Example- 1,2,3,4,5,6,7 (rotate by 1 unit default direction[clockwise] ->> 7,1,2,3,4,5,6)
	
	public static void main(String args[])
	{
		int arr[]= {56,45,65,6,87,9,789,79847};
		System.out.println("Array before: "+Arrays.toString(arr));
		int i, x = arr[arr.length -1] ;
		//here 1 shows that we need to rotate the array one 1 unit only by setting the swapping variable to array length minus 1
		for(i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
			arr[0]=x;
		}
		System.out.println("Array after: "+Arrays.toString(arr));
	}
}