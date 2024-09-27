//Write a Java program to remove the third element from an array list.
import java.util.*;
class RemoveElementEx
{
    public static void main(String[]args)
    {
    
    ArrayList<Integer>al=new ArrayList<Integer>();
    al.add(123);
    al.add(345);
    al.add(567);
    al.add(789);
    al.add(890);
    System.out.println(al);/*-before*/
    al.remove(2);
    System.out.println(al);/* after remove element*/
}
}

/*
output:
[123, 345, 567, 789, 890]
[123, 345, 789, 890]

*/
