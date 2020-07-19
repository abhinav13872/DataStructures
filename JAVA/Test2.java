class Student2
{
int x;
int y;
Student2()
{
System.out.println("Default constructor");
}
Student2(int x,int y)
{
this();
System.out.println("x:"+x);
System.out.println("y:"+y);
}

}
class Test2
{
public static void main(String[] args)
{
Student2 s=new Student2(12,13);
}
}
//calling default constructor in parameterized constructor
/*
Remember:-
1)calling via "this" must be the first statement!!
*/
