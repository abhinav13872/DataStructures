package GENERICS;
class Gen3
{
public <T> void printF(T t)
{
System.out.println(t.getClass().getName()+"="+t);
}
public static void main(String[] args)
{
Gen3 g=new Gen3();
g.printF(11);
g.printF("Hello");
g.printF(1.2);
}
}
/*
T,T1,T2,T3 => for types
T,S,U,V =>also for types
E => for Element
K =>for Key
N => for Number
*/
