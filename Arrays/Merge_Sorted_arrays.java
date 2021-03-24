//package competitive;
import java.util.Arrays;

public class Merge_arrays
{
    public static void main (String[] args)
    {
        int arr1 []= new int [] {1,5,9,10,15,20};
        int arr2 []= new int [] {2,3,8,13};
        System.out.println("Arrays Before Merging");
        System.out.println("first Array"+Arrays.toString(arr1));
        System.out.println("second Array"+Arrays.toString(arr2));
        int i=0,j=0,arr2_length=arr2.length - 1;
        while(i<arr2_length && j<arr1.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                int temp = arr2[j];
                arr2[j]=arr1[arr2_length];
                arr1[arr2_length]=temp;
                j++;
                arr2_length--;
            }
            
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Arrays after Merging");
        System.out.println("first Array"+Arrays.toString(arr1));
        System.out.println("second Array"+Arrays.toString(arr2));
    }
    
}