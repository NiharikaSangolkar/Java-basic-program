import java.util.Scanner;
class Armstrong
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("enter the digit:");
        int digit=sc.nextInt();
        int m=n,sum=0,rem;
        while(n>0)
        {
            rem=n%10;
            sum=(int)(sum+Math.pow(rem,digit));
            n=n/10;
        }
        if(sum==m)
        {
            System.out.println(m+" is armstrong number");
            
        }
        else
        {
             System.out.println(m+" is not armstrong number");
            
        }
    }
}

/*
output:
enter the number:
153
enter the digit:
3
153 is armstrong number


*/
