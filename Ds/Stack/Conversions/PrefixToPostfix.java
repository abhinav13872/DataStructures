package CONVERSIONS;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math.*;


public class PrefixToPostfix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("PREFIX: ");
String str=sc.nextLine();

//STEP-1:
String infix=prefixToInfix(str);
System.out.println("INFIX: "+ infix);

//STEP-2:
System.out.println("POSTFIX: "+ infixToPostfix(infix));
}


public static String prefixToInfix(String str)				//PREFIX -> INFIX
{
Stack<String> s=new Stack<>();

for(int i=str.length()-1;i>=0;i--)
{
char c=str.charAt(i);

//OPERAND CASE:-
if(Character.isDigit(c) || Character.isLetter(c)) s.push(c+"");

//OPERATOR CASE:-
if(c == '+' || c == '-' || c == '*' ||c == '/' ||c == '^')
{
String A=s.pop();
String B=s.pop();
String C='(' + A + c + B + ')';
s.push(C);
}
}
return s.pop();
}


public static String infixToPostfix(String str)				//Infix -> Postfix
{
Stack<Character> s=new Stack<>();

str+=')';
s.push('(');

String PE="";									//POSTFIX_EXPRESSION
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

//OPERANDS:
if(Character.isDigit(c) || Character.isLetter(c)) PE+=c;

//OPERATOR
if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '$')
{
if(Pres(s.peek()) >= Pres(c)) while(s.peek() != '(') PE+=s.pop();
s.push(c);
}

//OPENING BRACE:
if(c == '(') s.push(c);

//CLOSING BRACE:
if(c == ')')
{
while(s.peek() != '(') PE+=s.pop();
s.pop();
}
}
return PE;
}


public static int Pres(char c)						//PRESIDANCE
{
if(c == '+' || c == '-') return 1;
if(c == '*' || c == '/') return 2;
if(c == '^' || c == '$') return 3;
return 0;
}
}
