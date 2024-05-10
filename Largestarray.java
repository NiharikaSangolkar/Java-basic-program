
/*
Write a Java Program to Find the Largest Element in Array
Input: [ 7, 2, 5, 1, 4]
Output: 7
*/
import java.util.Arrays;
class largestarray{
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
       int arr[]={7,2,5,1,4};
      Arrays.sort(arr);
      System.out.println("maximum array:"+arr[arr.length-1]);
}
}
