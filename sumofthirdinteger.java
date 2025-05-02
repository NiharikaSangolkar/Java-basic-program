// Sum Equals Third Integer

// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
// Sample Output:

// Input the first number : 5                                            
// Input the second number: 10                                            
// Input the third number : 15                                            
// The result is: true

import java.util.*;
class sumofthird{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first integrers:");
        int n1=sc.nextInt();
         System.out.println("enter second integrers:");
         int n2=sc.nextInt();
        System.out.println("enter third  integrers:");
        int n3=sc.nextInt();
        if(n3==(n1+n2))
        {
             System.out.println("The result is: true");
            
        }
        else
        {
             System.out.println("The result is: false");
        }
        
    }
}
