package STRING;
import java.util.*;
class StringTest1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of testcases:- ");
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
StringBuilder sb=new StringBuilder(sc.nextLine().trim());
System.out.println("Enter the method:- ");
String i=sc.nextLine().trim();//scanning method


if(i.equalsIgnoreCase("append"))
{
System.out.println("Enter a String to be appended:- ");
String s=sc.nextLine().trim();
sb.append(s);
}
else if(i.equalsIgnoreCase("insert"))
{
System.out.println("Enter the index where string has to be inserted:- ");
int x=Integer.parseInt(sc.nextLine().trim());
System.out.println("Enter the string to be inserted:- ");
String s=sc.nextLine().trim();//scan string to insert
sb.insert(x,s);
}
else if(i.equalsIgnoreCase("replace"))
{
System.out.println("Enter the starting index of replace:- ");
int x=Integer.parseInt(sc.nextLine().trim());
System.out.println("Enter the ending index of replace:- ");
int y=Integer.parseInt(sc.nextLine().trim());
System.out.println("Enter the String:- ");
String s=sc.nextLine().trim();
sb.replace(x,y,s);
}
else if(i.equalsIgnoreCase("delete"))
{
System.out.println("Enter the starting index of delete:- ");
int x=Integer.parseInt(sc.nextLine().trim());
System.out.println("Enter the ending index of delete:- ");
int y=Integer.parseInt(sc.nextLine().trim());
sb.delete(x,y);//deletion from x to before y
}
else if(i.equalsIgnoreCase("substring"))
{
System.out.println("Enter the starting index of substring:- ");
int x=Integer.parseInt(sc.nextLine().trim());
System.out.println("Enter the ending index of substring:- ");
int y=Integer.parseInt(sc.nextLine().trim());
sb.substring(x,y);//substring from x to before y
}

System.out.println("String: "+sb);
t--;
}
}
}
