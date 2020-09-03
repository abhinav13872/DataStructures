package ACCESSMODIFIERS2;
import ACCESSMODIFIERS1.*;


public class third extends first
{
public static void main(String[] args)
{
third t=new third();

/*
System.out.println("a: "+t.a);
private access item is limited to the package's
class in which it has been created so can't be 
accessed outside the package..
**/

System.out.println("b: "+t.b);
/*
public access item can be accessed inside as
well as outside the package in which it has been
created..
**/


System.out.println("c: "+t.c);//protected
/*
protected access item can be accessed inside
the package where it has been created but
outside the package it can be accessed only
in a subclass of class in which item has been
created!
**/

/*
System.out.println("d: "+t.d);
default access is limited to the package so
item can't be accessed in another package..
**/
}
}
