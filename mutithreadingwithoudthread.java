/*
Mutithreading without threds 
*/
import java.util.*;
class Multihreadingwithout{
    void task1()
    {
        for(int i =1;i<=5;i++)
        System.out.println("task-1 count"+i);
        
    }
     void task2()
    {
        for(int i =1;i<=5;i++)
        System.out.println("task-2 count"+i);
        
    }
    public static void main(String[]args)
    {
        Multihreadingwithout mth=new Multihreadingwithout();
        mth.task1();
        mth.task2();
    }
}

/*
op:
task-1 count1
task-1 count2
task-1 count3
task-1 count4
task-1 count5
task-2 count1
task-2 count2
task-2 count3
task-2 count4
task-2 count5

*/
