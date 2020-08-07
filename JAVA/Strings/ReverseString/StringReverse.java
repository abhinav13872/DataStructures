package REVERSESTRING;
import java.util.*;


class StringReverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=Integer.parseInt(sc.nextLine());

while(T-- > 0)
{
System.out.print("STRING: ");
String str=sc.nextLine().trim();

System.out.println("REVERSED_STRING: \""+Reverse(str)+"\"");
}
}


private static String Reverse(String str)
{
StringBuilder sb=new StringBuilder(str);
return sb.reverse().toString();
}
}
//REVERSE STRING USING STRINGBUILDER CLASS
