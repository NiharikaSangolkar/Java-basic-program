/*Write a Java program to create an array list, add some colors (strings) and print out the collection.*/

import java.util.*;
class colourex{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add("red");
        al.add("blue");
        al.add("black");
        al.add("pink");
        System.out.println(al);
        
    }
}

/* output:  [red, blue, black, pink]*/
