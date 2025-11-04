/*
Fruits List: [Apple, Banana, Cherry, Mango, Banana]
First fruit: Apple
After modification: [Apple, Banana, Orange, Mango, Banana]
After removing Banana: [Apple, Orange, Mango, Banana]
Iterating through List:
Apple
Orange
Mango
Banana
Total fruits: 4
*/
import java.util.*;
class listex{
    public static void main(String[]args)
    {
        List<String>ls=new ArrayList<>();
        ls.add("Apple");
        ls.add("Banana");
        ls.add("cherry");
        ls.add("mango");
         ls.add("Banana");
       System.out.println("fruit list:"+ls);
       System.out.println("first fruit:"+ls.get(0));
       ls.set(2,"Orange");
             
       System.out.println("modification list:"+ls);
       ls.remove("Banana");
           System.out.println("removed baanana list:"+ls);
           
           for(String la:ls)
           {
               System.out.println("ierating through list:"+la);
           }
       
         System.out.println("size of list:"+ls.size());
       
       
    }
}

/*
output
fruit list:[Apple, Banana, cherry, mango, Banana]
first fruit:Apple
modification list:[Apple, Banana, Orange, mango, Banana]
removed baanana list:[Apple, Orange, mango, Banana]
ierating through list:Apple
ierating through list:Orange
ierating through list:mango
ierating through list:Banana
size of list:4
*/
