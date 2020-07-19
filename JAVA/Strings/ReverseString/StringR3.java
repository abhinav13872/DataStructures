package REVERSESTRING;
import java.util.*;
public class StringR3
{
static int CountPallindrome(String str)
{
int count=0;
String s[]=str.split("\\s");//split into array
for(String c:s)
{
StringBuilder sb=new StringBuilder(c);
sb.reverse();
if(c.equalsIgnoreCase(sb.toString()))
{
count++;
}
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
String a=sc.nextLine().trim();
int count=CountPallindrome(a);//count of pllindrome in a string
System.out.println(count);
t--;
}
}
}
//PALLINDROME TEST
