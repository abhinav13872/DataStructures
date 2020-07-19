package INHERITANCE;
class one
{
public void programming()
{
System.out.println("Programming");
}
}
class two extends one
{
public void print_with()
{
System.out.println("with");
System.out.println("Java");
}
}
public class Main
{
public static void main(String[] args)
{
two g=new two();
g.programming();
g.print_with();
}
}
