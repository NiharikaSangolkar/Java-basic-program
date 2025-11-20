import java.util.*;

class rotateArray{
    public static void reverser(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[]args)
    {
        int  arr[] = {1, 2, 3, 4, 5, 6};
         int d = 8;
         int n=arr.length;
         d=d%n;
         reverser(arr,0,d-1);
         reverser(arr,d,n-1);
         reverser(arr,0,n-1);
         System.out.println(Arrays.toString(arr));
         
    }
}
