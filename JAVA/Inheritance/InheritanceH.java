package INHERITANCE;
class A
{
public static void p1()
{
System.out.println("Parent class");
}
}
class B
{
public static void p1()
{
System.out.println("Child class");
}
}
class InheritanceH
{
public static void main(String [] args)
{
A a=new A();//a is a referance variable of class A(superclass of B)
B b=new B();//b is a referance variable of class B(subclass of A)
a.p1();
b.p1();
}
}
/*
Remember:-
=>In case of static members static variables inherit nhi hote but static methods hote hein
  but agr PARENTCLASS aur CHILDCLASS mein same signature + same name ke method hue then HIDING
  occurs.
=>Agr PARENTCLASS ke referance variable se access krenge static method ko then CHILDCLASS ka
  method HIDE hojaega!!
=>But agr CHILDCLASS ke referance variable se access krein static method ko then PARENTCLASS
  ka method HIDE hojaega!!
*/
