
import java.util.Scanner;
class primenum{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
       for(int i=3;i<=Math.sqrt(n);i+=2)
       {
           if(n%i==0)
           {
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        if(isprime(n1))
        {
            System.out.println("is prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
       
    }
}
