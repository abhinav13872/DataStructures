package GENERICS;
import java.util.*;


class Gen5
{
public static void main(String[] args)
{
Gen5 g=new Gen5();
List<Integer> l1=new ArrayList<Integer>();//list-1 created
l1.add(1);
l1.add(2);
l1.add(3);
List<Integer> l2=new ArrayList<Integer>();//list-2 created
l2.add(9);
l1.addAll(l2);
//System.out.println(l1.getClass().getName()+":-  ");//java.util.ArrayList
g.PrintList(l1);
List<String> l3=new ArrayList<String>();//list-3 created
l3.add("A");
l3.add("B");
l3.add("C");
l3.remove(1);
l3.add("M");
l3.set(1,"Avantika");//set method overrides the old value
l3.add(2,"Bhasin");//DYNAMICALLY SIZE ADJUSTED
//System.out.println(l1.getClass().getName()+":-  ");//java.util.ArrayList
g.PrintList(l3);
}
public <T> void PrintList(List <T> list)//Generic Method
{
System.out.println(list);
for(T v:list)
System.out.print(v+" ");
System.out.println();
}
}

