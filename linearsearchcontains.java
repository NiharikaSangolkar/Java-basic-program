/*
check in the list 53 is there or not,if present then print it is contains otherwise print not contains.
*/
import java.util.*;
class LinearSerachex{
    public static void main(String[]args)
    {
        int []arr={12,3,27,53,18,62,88,6};
        int x=53;
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
              System.out.println("it is not contains");
            
        }
    }
}
