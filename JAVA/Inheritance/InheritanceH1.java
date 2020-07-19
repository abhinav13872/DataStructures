package INHERITANCE;
class A
{
int x;//instance variable
{
x=10;
}
public static void p1()
{
System.out.println("A =>p1()");
}
public static void p2()
{
System.out.println("A =>p2()");
}
}
class B extends A
{
{
x++;
}
public static void p2()
{
System.out.println("B =>p2()");
}
}
class InheritanceH1
{
public static void main(String[] args)
{
A a=new B();
B b=new B();
a.p2();//p2() of B hide hogya A ke p2() se (bcoz referance variable is of A class)
b.p2();//p2() of A hide hogya B ke p2() se (bcoz referance variable is of B class)
b.p1();//p1() A se inherit hua B mei
System.out.println(b.x);
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
