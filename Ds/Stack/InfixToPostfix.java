package STACK;
import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfix
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Scan Testcases: ");
int T=Integer.parseInt(sc.nextLine());
while(T-->0)
{
System.out.print("Scan INFIX: ");
String str=sc.nextLine();

System.out.println("POSTFIX: "+ InfixToPostfixUtil(str));
}
}


public static String InfixToPostfixUtil(String str)
{
String res="";
Stack<Character> s=new Stack<>();

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(Character.isDigit(c)) res=res+c;//OPERAND CASE
else
{
while(!s.isEmpty() && Prec(s.peek()) >= Prec(c)) res=res + s.pop();
s.push(c);//OPERATOR's CASE
}
}

while(!s.isEmpty()) res=res+s.pop();
return res;
}


public static int Prec(char c)
{
if(c=='+' || c=='-') return 1;
if(c=='*' || c=='/') return 2;
return 0;
}

}
