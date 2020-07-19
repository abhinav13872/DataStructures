package ACCESSMODIFIERS1;
public class second
{
public static void main(String[] args)
{
first f=new first();
//System.out.println(f.a);//since its private it cant be accessed in same package too!!
System.out.println(f.b);//public
System.out.println(f.c);//protected
System.out.println(f.d);//default
}
}
