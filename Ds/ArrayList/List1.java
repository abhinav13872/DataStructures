package ARRAYLIST;
import java.util.ArrayList;
import java.util.Iterator;

public class List1
{
public static void main(String[] args)
{
//list1 can only store String Objects
ArrayList<String> list1=new ArrayList<String>();

//list2 can store any type of Objects
ArrayList list2=new ArrayList();

Student s1=new Student("Atharv",1811981370);

list1.add("Abhinav");
list1.add("Abhishek");
list1.add("Ravin");
list1.add("Ankush");
list1.add("Paras");
//list1.add(20);//ERROR
//list1.add(19);//ERROR

list2.add("Abhinav");
list2.add("Abhishek");
list2.add(20);
list2.add(24);
list2.add(s1);//referance of Student's object

//1.Print elements of ArrayList
System.out.println("list1 is: "+list1);
System.out.println("list2 is: "+list2);

//2.Get the element from list
String Name=list1.get(2);
System.out.println("Name is: "+Name);

Object O=list2.get(2);
System.out.println("O is: "+O);

//3.Update element in List
list1.set(2,"Avantika");
System.out.println("Updated list1 is: "+list1);

//4.Remove element in List
list1.remove(2);
System.out.println("list1 after deletion: "+list1);

//5.Search an Element
if(list1.contains("Ravin"))
System.out.println("Ravin is in the list1");

//6.Iterate in ArrayList
System.out.println("-----------------------ITERATING WITH FOR-LOOP----------------------");
for(int i=0;i<list1.size();i++)
System.out.println(list1.get(i));
System.out.println("--------------------------------------------------------------------");

System.out.println("------------------ITERATING WITH ENHANCED FOR-LOOP------------------");
for(String str:list1)
System.out.println(str);
System.out.println("--------------------------------------------------------------------");

System.out.println("----------------------ITERATING WITH ITERATOR-----------------------");
Iterator<String> itr=list1.iterator();
while(itr.hasNext())
{
String str=itr.next();
System.out.println(str);

if(str.equals("Paras"))
{
itr.remove();//removing an element using iterator
}
}
System.out.println("--------------------------------------------------------------------");
System.out.println("list1 is: "+list1);

//9.Remove all elements in a List
list1.clear();
System.out.println("list1 is: "+list1);
} 
}
class Student
{
int Id;
String Name;
public Student(String Name,int Id)
{
this.Id=Id;
this.Name=Name;
}
}
