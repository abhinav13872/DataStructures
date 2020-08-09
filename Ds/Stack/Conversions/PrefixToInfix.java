package CONVERSIONS;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math.*;


public class PrefixToInfix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("PREFIX: ");
String str=sc.nextLine();

System.out.println("INFIX: "+Convert(str));
}


public static String Convert(String str)
{
Stack<String> s=new Stack<>();

for(int i=str.length()-1;i>=0;i--)
{
char c=str.charAt(i);

//OPERAND CASE:-
if(Character.isDigit(c) || Character.isLetter(c)) s.push(c+"");

//OPERATOR CASE:-
if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '$')
{
String A=s.pop();
String B=s.pop();
String C='(' + A + c + B + ')';
s.push(C);
}
}

return s.pop();
}
}
/*
//*+2322^52
*/
