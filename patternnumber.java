/*
print : print pattern :7
1 1 1 1 1 1 1 
2 2 2 2 2 2 2 
3 3 3 3 3 3 3 
4 4 4 4 4 4 4 
5 5 5 5 5 5 5 
6 6 6 6 6 6 6 
7 7 7 7 7 7 7 
*/
import java.util.*;
class pattern{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
           
                 System.out.print(i+" ");//small letter
            }
            System.out.println();
        }
    }
}
