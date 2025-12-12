import java.util.*;
class countingvowels{
    public static void main(String[]args)
    {
        String v="welcometohelloworld";
        int count=0;
        for(int i=0;i<v.length();i++)
        {
            char ch=v.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u')
            {
                count++;
                
            }
        }
        System.out.println("number of voewl:"+count);
    }
}
