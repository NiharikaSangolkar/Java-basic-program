import java.util.*;

class star1{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row:");
        int row=sc.nextInt();
        System.out.println("enter col:");
        int col=sc.nextInt();
        for(int i=1;i<=row;i++)
        {   for( int j=1;j<=col;j++)
            {
                System.out.print(" * ");
                
            }
            System.out.println( );
        }
        
        
    }
}
