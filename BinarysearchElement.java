import java.util.*;

class BinaryarrayExample{
    public static void main(String[]args)
    {
        int arr[]={10,20,30,40,50,60};
        int key=30;
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("element found at index is: "+mid);
                return;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
                
            }
        }
        System.out.println("element not found");
    }
}

//element found at index is: 2
