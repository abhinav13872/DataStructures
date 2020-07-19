package INTERFACE;
interface In2
{
int a=10;//public+static+final variable
static void display()//public+static method
{
System.out.println("Hello");
}
}
class M5 implements In2
{

public static void main(String[] args)
{
In2.display();//Interface ka method call hojaega
}
}
/*
static mtlb object bnane ki jroort nhi
*/
