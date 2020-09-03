package ACCESSMODIFIERS1;


public class first
{
private int a=10;	//private access
public int b=20;	//public access
protected int c=30;	//protected access
int d=40;		//default access


public static void main(String[] args)
{
first f=new first();

System.out.println("a: "+f.a);//private
System.out.println("b: "+f.b);//public
System.out.println("c: "+f.c);//protected
System.out.println("d: "+f.d);//default
}
}
