package INHERITANCE;
class A1
{
void m1()
{
System.out.println("Inside A1's m1 method");
}
}
class B1 extends A1
{
void m1()
{
System.out.println("Inside B1's m1 method");
}
}
class C1 extends A1
{
void m1()
{
System.out.println("Inside C1's m1 method");
}
}
class M1
{
public static void main(String[] args)
{
A1 a=new A1();
B1 b=new B1();
C1 c=new C1();
A1 ref;//A1 ka referance variable
ref=a;
ref.m1();
ref=b;//A1 ref=new B1()
ref.m1();
ref=c;
ref.m1();//A1 ref=new C1()
}
}
/*
method overriding ko avoid krne ke lie hmne object bnadie then referances bdldi!!
*/
