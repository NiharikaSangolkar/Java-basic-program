/*Write a Java program to reverse elements in an array list.
*/
import java.util.*;
class reversearray{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add("pink");
        al.add("black");
        al.add("blue");
        al.add("green");
        al.add("purple");
        System.out.println("original array: ");
        System.out.println(al);
        Collections.reverse(al);
         System.out.println("reverse array: ");
         System.out.println(al);
        
    }
}
//output:
/*
original array: 
[pink, black, blue, green, purple]
reverse array: 
[purple, green, blue, black, pink]



*/
