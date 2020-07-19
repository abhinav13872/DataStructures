package STRING;
import java.util.Scanner;
public class StringTest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string:-");
String str=sc.nextLine();

System.out.print("No. of Testcases:-");
int T=sc.nextInt();
while(T-->0)
{

System.out.print("Enter the action:-");
String act=sc.next().trim();

if(act.equalsIgnoreCase("indexof"))
{
System.out.print("Enter the string to be searched in the string:-");
String x=sc.next().trim();
System.out.print("Enter the starting point:-");//SEARCH FROM LEFT
int n=sc.next();
System.out.println(str.indexOf(x,n));
}
else if(act.equalsIgnoreCase("lastindexof"))
{
sc.nextLine();
//SCAN EMPTY STRING AFTER SCANNING INTEGER TO SCAN STRING!!

System.out.print("Enter the string to be searched in the string:-");
String x=sc.nextLine().trim();
System.out.print("Enter the starting point:-");//SEARCH FROM RIGHT
int n=sc.nextInt();
System.out.println(str.lastIndexOf(x,n));
}
else if(act.equalsIgnoreCase("replace"))
{
System.out.print("Enter the string to be replaced in the string:-");
String x=sc.next();
System.out.print("Enter the String:-");
String n=sc.next();
System.out.println(str.replace(x,n));
}
else if(act.equalsIgnoreCase("replaceFirst"))
{
System.out.print("Enter the string to be replaced in the string:-");
String x=sc.next();
System.out.print("Enter the String:-");
String n=sc.next();
System.out.println(str.replaceFirst(x,n));
}
else if(act.equalsIgnoreCase("replaceAll"))
{
System.out.print("Enter the string to be replaced in the string:-");
String x=sc.next();
System.out.print("Enter the String:-");
String n=sc.next();
System.out.println(str.replaceAll(x,n));
//IN CASE OF REPLACEALL METHOD WE CAN USE REGULAR EXPRESSIONS TOO
/*System.out.println(str.replaceAll("(.*)y(.*)","AVANTIKA"));*/
}
}
}}
