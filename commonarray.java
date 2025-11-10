import java.util.*;
class CommonArray{
    public static void main(String[]args)
    {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        
        ArrayList<Integer>common=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
             for(int j=0;j<arr1.length;j++)
             {
                 if(arr1[i]==arr2[j])
                 {
                     common.add(arr1[i]);
                 }
             }
            
        }
        System.out.println(common);
        
    }
}
