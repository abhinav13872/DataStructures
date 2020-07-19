package ACCESSMODIFIERS1;
public class first
{
private int a=10;
public int b=20;
protected int c=30;
int d=40;
public static void main(String[] args)
{
first f=new first();
System.out.println(f.a);//private
System.out.println(f.b);//public
System.out.println(f.c);//protected
System.out.println(f.d);//default
}
}
