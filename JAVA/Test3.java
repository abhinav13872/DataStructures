import java.util.*;
class Student3
{

Student3()
{}
Student3(int a,String n)
{
System.out.println("Name:"+n);
System.out.println("Age:"+a);
}

}
class Test3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
sc.nextLine();
String n=sc.nextLine();
Student3 s=new Student3(a,n);

}
}
//Scanning and passing arguements through constructor!!
/*
Remember:-
To scan string after scanning integer
don't forget to write "sc.nextLine();" before scanning string
else string can't be scanned!!
*/
