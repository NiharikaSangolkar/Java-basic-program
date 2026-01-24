import java.util.*;
class trycatchex{
    public static void main(String[]args)
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("system cannot divide by zero");
        }
    }
}

/*
op:
system cannot divide by zero

*/
