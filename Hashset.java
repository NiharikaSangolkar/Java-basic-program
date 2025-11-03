import java.util.*;
class hashsetex{
 public static void main(String[]args)
 {
     HashSet<Integer>as=new HashSet<Integer>(Arrays.asList(3,4,2,5,16,78));
     System.out.println("original list:"+as);
     
     if(as.contains(78))
     {
         as.remove(78);
         as.add(101);
     }
      System.out.println("updated  list:"+as);
     
 }
}

/*
output
original list:[16, 2, 3, 4, 5, 78]
updated  list:[16, 2, 3, 4, 5, 101]

=== Code Execution Successful ===


*/
