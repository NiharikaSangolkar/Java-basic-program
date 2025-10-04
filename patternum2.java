//print pattern:enter :3
// 123
// 123
// 123
import java.util.*;
class patternumber{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
             System.out.println();
        }
    }
}
