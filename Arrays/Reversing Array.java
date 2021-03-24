class array_rev
{
	public static void main(String args[])
	{
		int arr [] = {123,547,6,5,8,65,78,56,45,87,9,789,79847};
		int arr_cpy []= new int [arr.length];
		int temp = arr.length;
		/* for(int i=0;i<arr.length;i++) 
		//there is some problem with this piece of code a sit returns only thr arr.length/2 part of the original input array ?
		{
			arr[temp - 1] = arr[i];
			temp = temp - 1 ;
			System.out.println("Reversed array is :"+arr[i]);
		}*/ 
		for(int i=0;i<arr.length;i++)
		{
			arr_cpy[temp - 1] = arr[i]; //assigning value of ist arr to 2nd array but in reversed direction
			temp = temp - 1 ;
		}
		for(int k = 0;k<arr_cpy.length ;k++)
		{
			System.out.println("Reversed array is :"+arr_cpy[k]);
		} 
		System.out.println("array length is "+arr.length);

	}
}