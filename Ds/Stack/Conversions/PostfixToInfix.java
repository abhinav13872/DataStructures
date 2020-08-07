package CONVERSIONS;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math.*;


public class PostfixToInfix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("POSTFIX: ");
String str=sc.nextLine();

System.out.println("INFIX: "+Convert(str));
}


public static String Convert(String str)
{
Stack<String> s=new Stack<>();

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

//OPERAND CASE:-
if(Character.isDigit(c) || Character.isLetter(c)) s.push(c+"");

//OPERATOR CASE:-
if(c == '+' || c == '-' || c == '*' ||c == '/' ||c == '^')
{
String A=s.pop();
String B=s.pop();
String C='(' + B + c + A + ')';
s.push(C);
}
}

return s.pop();
}
}
/*
23+2*2/52^/
*/
