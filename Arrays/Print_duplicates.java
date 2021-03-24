
import java.util.Arrays;

public class Find_duplicate
{
    public static void main (String[] args)
    {
        int arr [] = new int[]{1,2,3,4,5,-6,5,4,7,-6,1};
        System.out.println("The array we have is : "+Arrays.toString(arr));
        System.out.print("The duplicate elements in the above array is : ");
        for(int i=0; i< arr.length;i++)
        {
            int j= Math.abs(arr[i]); //making every element positive from the above array
            if(arr[j]>=0) 
            {
                arr[j]=-arr[j];//then again making them negative
                
            }
            else
            {
                 System.out.print(j+" ");
            }
           
                
            
        }
    }
    
}
