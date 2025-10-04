/*
print alphabet: in capital
abcd
abcd
abcd

*/
import java.util.*;
class alphapattern{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            //   capital  // System.out.print((char)(j+64)+" ");
                 System.out.print((char)(j+96)+" ");//small letter
            }
            System.out.println();
        }
    }
}
o/p:
4
a b c d 
a b c d 
a b c d 
a b c d 
