package STRING;
import java.util.*;
class Student
{
int id;
String name;
String city;

Student()
{}
Student(int i,String n,String c)
{
id=i;
name=n;
city=c;
}
public String toString()
{
return (id+" "+name+" "+city);
}
public static void main(String[] args)
{
Student s1=new Student(10,"Abhinav","Chandigarh");
Student s2=new Student(20,"Paras","Rajasthan");
System.out.println(s1);
System.out.println(s2);
System.out.println("s1==s2: "+(s1==s2));
}
}
//toString() method overriding for a given class
