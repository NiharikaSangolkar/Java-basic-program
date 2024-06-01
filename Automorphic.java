// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Automorphic{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int square=n*n,temp=1,n1=n;
        while(n1>0)
        {
            n1=n1/10;
            temp=temp*10;
        }
        square=square%temp;
        if(n==square)
        {
            System.out.println("it is automorphic number");
            
        }
        else
        {
            System.out.println("it is not automorphic number");
        }
        
    }
}
