class RepeatElement
{
	void printRepeating(int arr[], int size)
	{
		int i;
		System.out.println("The repeating elements are : ");
	
		for(i = 0; i < size; i++)
		{
			if(arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}		
	}

	/* Driver program to test the above function */
	public static void main(String[] args)
	{
		RepeatElement repeat = new RepeatElement();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}

/* class RepeatElement
{
	void printRepeating(int arr[], int size)
	{
		int count[] = new int[size];
		int i;

		System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++)
		{
			if (count[arr[i]] == 1)
				System.out.print(arr[i] + " ");
			else
				count[arr[i]]++;
		}
	}

	public static void main(String[] args)
	{
		RepeatElement repeat = new RepeatElement();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}
 */
 
 /* class RepeatElement
{
	void printRepeating(int arr[], int size)
	{
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++)
		{
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		RepeatElement repeat = new RepeatElement();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}
 */
