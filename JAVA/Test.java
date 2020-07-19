class Student
{
int x=50;//instance variable
static int y=100;//static variable

{
x=888;
}//instance initialization block/instance initializer

static
{
y=900;
}//static initialization block/static initializer

Student()//constructor
{}



void s(int x)//instance method(here x is a local variable limited to the method only)
{
System.out.println(x);
System.out.println(this.x);//this refers to instance member of current class
//(this.x signinifying current class vla x mtlb instance variable x)
}
}
class Test
{
public static void main(String[] args)
{
Student s1=new Student();//call to default constructor
/*
(object bnte hi uske constructor ko call hoti h sbse pehle)
*/
s1.s(55);
//passing an arguement to instance method
System.out.println(Student.y);
Student.y=88;
/*
classname. mtlb static member ko access krna h
now the value is changed to 88 of static variable y
*/
}
}
/*
1)sbse pehle static initaializer
2)object bnte hi constructor is called(to construct it)
(instance initializer ka saara content is the content to be first in constructor's content)
*/
