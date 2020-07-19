package INHERITANCE;
class Person
{
int age;
String name;
String gender;
/*
instance variables having default access permmission mtlb accessible in same package
(mtlb same class,same package subclass,same package non subclass)
*/

Person()//default constructor
{}

void set(String n,int a,String g)
{
name=n;
age=a;
gender=g;
}
void get()
{
System.out.println("Name:"+name+" Gender:"+gender+" Age:"+age);
}
}
class Teacher7 extends Person//inheriting base class
{
String subject;

void set(String n,int a,String g,String s)
{
name=n;
age=a;
gender=g;
subject=s;
}
void get()
{
System.out.println("Name:"+name+" Gender:"+gender+" Age:"+age+" Subject:"+subject);
}
}
class Student7 extends Person
{
int id;
void set(String n,int a,String g,int i)
{
name=n;
age=a;
gender=g;
id=i;
}
void get()
{
System.out.println("Name:"+name+" Gender:"+gender+" Age:"+age+" Id:"+id);
}
}
public class Test7
{
public static void main(String[] args)
{
Student7 s=new Student7();
s.set("Abhinav Mahajan",19,"male",1811981009);
s.get();
}
}
//HIRARCHIAL INHERITANCE
/*
agr inheritance kri h then same name ka function subclass mein
nhi bnaya then to vo inherit ho rha h but agr diff return type ka function 
bnaya then uss se overwrite hojaega superclass ka function
but agr ussi function ko call krna h then using super we can do that
*/
