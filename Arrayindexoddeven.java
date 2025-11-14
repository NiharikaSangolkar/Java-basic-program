
/* multiply odd indexed elements by 2
   and add 10 to even indexed elements */
import java.util.*;
class ArrayIndexex{
    public static void main(String[]args)
    {
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                System.out.print((arr[i]+10)+"");
            }
            else
            {
                 System.out.print((arr[i]*2)+"");
            }
        }
    }
} 

/*
output:
2040408060

*/
