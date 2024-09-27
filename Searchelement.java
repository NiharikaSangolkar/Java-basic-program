//Write a Java program to search for an element in an array list.

import java.util.*;

class serachex{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add("pragati");
        al.add("anjua");
        al.add("shifa");
        al.add("ram");
        al.add("priya");
        al.add("riya");
        System.out.println(al);
        System.out.println("search name:");
        Scanner sc=new Scanner(System.in);
        
        String search=sc.nextLine();
        if(al.contains(search))
        {
            System.out.println(search+" name found");
        }
        else
        {
            System.out.println(search+" name not found");
            
            
            
        }
    }
}
/*
output 1:
[pragati, anjua, shifa, ram, priya, riya]
search name:
priya
priya name found

output 2:
[pragati, anjua, shifa, ram, priya, riya]
search name:
varsha
varsha name not found




*/
