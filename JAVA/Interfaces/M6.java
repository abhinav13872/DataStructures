package INTERFACE;
interface In3
{
int a=10;//public+final+static variable

default void display()//default instance method
{
System.out.println("Hii Avantika!!");
}
}


class M6 implements In3
{
public static void main(String[] args)
{
M6 t=new M6();
t.display();//Interface ka method call hojaega
}
}
