package REVERSESTRING;
import java.util.*;


public class StringR3
{

static int CountPallindrome(String str)
{
int count=0;
String s[]=str.split("\\s");					//SPLIT INTO ARRAY

for(String c:s)
{
StringBuilder sb=new StringBuilder(c);
sb.reverse();

if(c.equalsIgnoreCase(sb.toString())) count++;
}
return count;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=Integer.parseInt(sc.nextLine());

while(T-->0)
{
System.out.print("STRING: ");
String a=sc.nextLine().trim();				//STRING
int count=CountPallindrome(a);				//COUNT
System.out.println("COUNT OF PALLINDROME: "+count);
}
}
}
//COUNT OF PALLINDROME IN A STRING
