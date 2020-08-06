package STACK;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math.*;


public class Evaluate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("SCAN POSTFIX EXPRESSION: ");
String str1=sc.nextLine().trim();
System.out.println("POSTFIX: "+PostfixEvaluate(str1));

System.out.print("SCAN PREFIX EXPRESSION: ");
String str2=sc.nextLine().trim();
System.out.println("PREFIX: "+PrefixEvaluate(str2));
}



public static int PostfixEvaluate(String str)				//POSTFIX_EVALUATION
{
Stack<Integer> s=new Stack<>();

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

//OPERAND CASE:-
if(Character.isDigit(c) || Character.isLetter(c)) s.push(c - '0');

//OPERATOR CASE:-
if(c == '+' || c == '-' || c == '*' ||c == '/' ||c == '^')
{
int A=s.pop();
int B=s.pop();
int res=solve(c,B,A);
s.push(res);
}
}
return s.pop();
}



public static int PrefixEvaluate(String str)				//PREFIX_EVALUATION
{
Stack<Integer> s=new Stack<>();

for(int i=str.length()-1;i>=0;i--)
{
char c=str.charAt(i);

//OPERAND CASE:-
if(Character.isDigit(c) || Character.isLetter(c)) s.push(c - '0');


//OPERATOR CASE:-
if(c == '+' || c == '-' || c == '*' ||c == '/' ||c == '^')
{
int A=s.pop();
int B=s.pop();
int res=solve(c,A,B);
s.push(res);
}
}
return s.pop();
}


public static int solve(char c,int A,int B)				//SOLVE
{
if(c == '+') return A+B;
if(c == '-') return A-B;
if(c == '*') return A*B;
if(c == '/') return A/B;
if(c == '^') return (int)Math.pow(A,B);
return 0;
}
}
/*
#TESTCASE:-

INFIX  : (2+3)*2/2/5^2
POSTFIX: 23+2*2/52^/
PREFIX : //*+2322^52 
*/
