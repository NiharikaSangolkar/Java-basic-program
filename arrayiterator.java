/*Write a Java program to iterate through all elements in an array list.*/
import java.util.*;
class fruitex{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add("apple");
        al.add("mango");
        al.add("blackbeery");
        System.out.println(al);
        for(String li:al)
        {
            System.out.println(li);
        }
        
        
    }
}

/*output:
[apple, mango, blackbeery]
apple
mango
blackbeery


*/
