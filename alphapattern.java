/*
print : print pattern
AAAA
BBBB
CCCC
DDDD
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
           
                 System.out.print((char)(i+64)+" ");//captial letter
            }
            System.out.println();
        }
    }
}

/*
op:
4
A A A A 
B B B B 
C C C C 
D D D D
*/
