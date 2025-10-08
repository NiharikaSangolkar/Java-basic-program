// Triangular number:
/*

       1
    2    2
    3  3  3
    4 4 4 4


*/
import java.util.*;

class trianglenumber{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter number:");
        int n=sc.nextInt();
        // int col=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}

/*


op:
enter number:
9
       1 
      2 2 
     3 3 3 
    4 4 4 4 
   5 5 5 5 5 
  6 6 6 6 6 6 
 7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 


*/
