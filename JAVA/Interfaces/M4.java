package INTERFACE;
interface In1
{
int a=10;//public+static+final variable (here it cant be empty else erro)
String s="Hello";//public+static+final variable
void display();//abstract+public method
}
interface In2 extends In1
{
int a=10;
}
interface In3 extends In1,In2
{}
class M4 implements In2
{
public void display()
{
System.out.println("Welcome");
}
public static void main(String[] args)
{
M4 t=new M4();
t.display();
System.out.println(a+s);
System.out.println(t.a);

}
}
/*
Remember:-
=>implement hua interface then int a=10 hogya class mein and String s="Hello"
=>In case of INHERITANCE static variables don't inherit while static methods do but
  in case of INTERFACES converse hota h iska!!
*/
