/*Write a Java program to shuffle elements in an array list.*/

import java.util.*;
class shufflelist{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add("orange");
        al.add("green");
        al.add("red");
        al.add("blue");
        System.out.println("before shuffling:");
        System.out.println(al);
        Collections.shuffle(al);
         System.out.println("after shuffling:");
        System.out.println(al);
    }
}

//output:
/*
before shuffling:
[orange, green, red, blue]
after shuffling:
[blue, orange, red, green]

*/
