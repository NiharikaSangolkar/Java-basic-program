import java.util.Scanner;
class palindrome
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rev=0;
        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.println(temp+" is palindrome");
        }
        else
        
        {
            System.out.println(temp+" is not  palindrome");
            
        }
    }
}
/*
output:
143
143 is not  palindrome
121
121 is palindrome


*/
