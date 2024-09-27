//Write a Java program to sort a given array list.

import java.util.*;
class sortarrayex{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add("rossy");
        al.add("pinky");
        al.add("varshu");
        al.add("riya");
        al.add("priya");
        al.add("anamika");
        System.out.println("before sorted array: "+al);
        Collections.sort(al);
        System.out.println("after sorted array: "+al);
    }
    
}

/*
before sorted array: [rossy, pinky, varshu, riya, priya, anamika]
after sorted array: [anamika, pinky, priya, riya, rossy, varshu]
*/
