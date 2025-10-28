import java.util.*;
class Arryaduplicate{
    public static void main(String[]args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(13,2,4,6,78,99,9,9,55,55));
        System.out.println("original list:"+al);
        Set<Integer> d=new LinkedHashSet<>(al);
        al.clear();
        al.addAll(d);
        Set <Integer> set=new TreeSet<>(al);
        System.out.println("duplicate remove list tree:"+set);
    //tree set is sort and remove dulicates
         System.out.println("duplicate remove list:"+al);
        }
}

/*
Output
original list:[13, 2, 4, 6, 78, 99, 9, 9, 55, 55]
duplicate remove list tree:[2, 4, 6, 9, 13, 55, 78, 99]
duplicate remove list:[13, 2, 4, 6, 78, 99, 9, 55]
*/
