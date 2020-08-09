package CONVERSIONS;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math.*;


public class PostfixToPrefix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("POSTFIX: ");
String str=sc.nextLine().trim();

String infix=postfixToInfix(str);
System.out.println("INFIX: "+ infix);

//STEP-2:
System.out.println("PREFIX: "+ infixToPrefix(infix));
}


public static String postfixToInfix(String str)				//POSTFIX -> INFIX
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


public static String infixToPrefix(String str)				//INFIX -> PREFIX
{
//STEP-1:REVERSE GIVEN STRING
StringBuilder sb=new StringBuilder(str);
sb.reverse();

for(int i=0;i<sb.length();i++)
{
char c=sb.charAt(i);
if(c == '(') sb.setCharAt(i,')');
if(c == ')') sb.setCharAt(i,'(');
}

//STEP-2:GET POSTFIX OF REVERSED STRING
String PE=infixToPostfix(sb.toString());

//STEP-3:REVERSE THE RESULT
sb=new StringBuilder(PE);
return sb.reverse().toString();
}


public static String infixToPostfix(String str)				//INFIX -> POSTFIX
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
