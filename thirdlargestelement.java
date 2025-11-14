/*find second and third largest element*/

import java.util.*;
class secondlargest
{
    public static void main(String[]args)
    {
        int arr[]={10,20,20,50,80};
        // int max=arr[0];
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>tmax && arr[i]!=max && arr[i]!=smax)
            {
                tmax=arr[i];
            }
        }
        
        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
    }
    
}
/*
op:
80
50
20
*/
