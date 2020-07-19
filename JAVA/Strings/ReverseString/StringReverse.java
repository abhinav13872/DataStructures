package REVERSESTRING;
import java.util.*;
class StringReverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
String a=sc.nextLine().trim();
StringBuilder sb=new StringBuilder(a);
sb.reverse();
System.out.println(sb);//sb.toString() automatically calls toString()
/*
toString method returns #code for user defined classes
but for predefined class it returns String!!
*/
t--;
}

}
}
//REVERSE STRING USING STRINGBUILDER CLASS
