
/* search element */
import java.util.*;
class ArrayIndexex{
    public static void main(String[]args)
    {
        int arr[]={10,20,30,40,50};
        int x=20;
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                found=true;
                break;
            }
            
            
        }
        if(found)
        {
            System.out.println("it is contains");
        }
        else
        {
             System.out.println("it is  not contains");
        }
    }
}

/* op:
it is contains

*/
