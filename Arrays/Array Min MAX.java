class array_min_max
{
	public static void main(String args[])
	{
		int arr [] = {123,547,6,5,8,65,78,56,45,87,9,789,79847,787,87,2,87,8,1123,547,6,5,8,65,78,56,45,87,9,789,79847,787,87,2,87,8,1123,547,6,5,8,65,78,56,45,87,9,789,79847,787,87,2,87,8,1123,547,6,5,8,65,78,56,45,87,9,789,79847,787,87,2,87,8,1123,547,6,5,8,65,78,56,45,87,9,789,79847,787,87,2,87,8,1123,547,6,5,8,5,8,65,78,56,45,87,9,789,79847,787,87,2,87,8,1};
		
		int max,min;
		max = min = arr[0]; //setting value to first element of arr is must !!
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max is "+max+" and Min is "+min+" length of the array is "+arr.length);
	}
}