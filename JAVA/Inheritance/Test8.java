package INHERITANCE;
class A
{
A()//default constructor of class A
{
System.out.println("A 1");
}
}
class B extends A
{
B()//default constructor of class B
{
this(4);
System.out.println("B 1");
}
B(int k)//parametrized constructor of class B
{
System.out.println("B 2");
}
}
class Test8
{
public static void main(String[] args)
{
B obj=new B();//call the default constructor of B

}
}
/*
B class ka object bna then usko memory mili aur jitne members B class
mein honge unhe object mein memoery mili
*/
/*
BASE class can have have some fields jo DERIVED class mei chiye so 
DEFAULT constructor is always called in firstline of BASE class via super()
till we not specify ki kisko call krna h via this() or super()
*/
