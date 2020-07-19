package INHERITANCE;
class A
{
int a;
public A()
{
System.out.println("DEFAULT CONSTRUCTOR OF A");
}
public A(float x)
{
System.out.println("x:"+x);
}
}
class B extends A
{
int b;
public B()
{
super(4.4f);
System.out.println("DEFAULT CONSTRUCTOR OF B");
}
public B(float m)
{
System.out.println(m);
}
}
class Example
{
public static void main(String[] args)
{
B obj=new B(4);
}
}
/*
1)actly jb B class ka objct bna usse memory mili and constructor ko call hua
then B class ka constructor Parent class ke DEFAULT constructor ko call krega but
hm khudse b parent class ke DEFAULT constructor ko call krva skte hein using super();

2)super()=>call to DEFAULT constructor of parent class/base class/superclass
super(1,2)=>call to PARAMETERIZED constructor of parent/base/super class
(but these must be the first line of child class/derived class/subclass constructor else error)

3)agr PARAMETERIZED constructor hota B class ka then by default vo default constructor ko hi pkdta parent class ke but yhn PARAMETERIZED ko call krane ke lie hm super use krenge!!
*/
