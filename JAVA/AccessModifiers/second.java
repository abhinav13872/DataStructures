package ACCESSMODIFIERS1;


public class second
{
public static void main(String[] args)
{
first f=new first();

//System.out.println(f.a);//since its private it can't be accessed in same package too!!

System.out.println("b: "+f.b);//public
System.out.println("c: "+f.c);//protected
System.out.println("d: "+f.d);//default
}
}
