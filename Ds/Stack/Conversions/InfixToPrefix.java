package CONVERSIONS;
import java.util.Scanner;
import java.util.Stack;
import java.lang.String;


public class InfixToPrefix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("Scan Testcases: ");
int T=Integer.parseInt(sc.nextLine());

while(T-- > 0)
{
System.out.print("Scan INFIX: ");
String str=sc.nextLine();

System.out.println("POSTFIX: "+ InfixToPostfixUtil(str));
System.out.println("PREFIX: "+ InfixToPrefixUtil(str));
}
}


public static String InfixToPrefixUtil(String str)				//INFIX_TO_PREFIX METHOD
{

//STEP-1: [REVERSE THE STRING]
StringBuilder sb=new StringBuilder(str);
sb.reverse();

//FOR COREECTION OF BRACES:-
for(int i=0;i<sb.toString().length();i++)
{
char c=sb.toString().charAt(i);

if(c == '(') sb.setCharAt(i,')');
else if(c == ')') sb.setCharAt(i,'(');
}

//STEP-2: [GET POSTFIX]
String Res=InfixToPostfixUtil(sb.toString());

//STEP-3: [REVERSE AGAIN]
sb=new StringBuilder(Res);
return sb.reverse().toString();
}


public static String InfixToPostfixUtil(String str)				//INFIX_TO_POSTFIX METHOD
{
Stack<Character> s1=new Stack<>();						//STACK

str+=')';
s1.push('(');

String E="";									//POSTFIX EXPRESSION

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);								//CURRENT CHARACTER


//CASE OF OPERANDS:-
if(Character.isDigit(c) || Character.isLetter(c)) E+=c;


//CASE OF OPENING BRACES:-
if(c == '(') s1.push(c);


//CASE OF OPERATOR:-
if(c == '+' || c == '-' || c == '/' || c == '*' || c == '^' || c == '$')
{
if(!s1.isEmpty() && getPresidance(s1.peek()) >= getPresidance(c)) while(!s1.isEmpty() && s1.peek() != '(') E+=s1.pop();
s1.push(c);
}


//CASE OF CLOSING BRACES:-
if(c == ')' || c == '}' || c == ']' && !s1.isEmpty())
{
while(!s1.isEmpty() && s1.peek() != '(') E+=s1.pop();
s1.pop();
}
}
return E;									//POSTFIX EXPRESSION
}


private static int getPresidance(char item)					//PRESIDANCE METHOD
{
if(item == '+' || item == '-') return 1;
if(item == '*' || item == '/') return 2;
if(item == '^' || item == '$') return 3;
return 0;
}
}
/*
#TESTCASES:-

 ((x+y)$a)+((x-c)/b)
 =>+$+xya/-xcb

 a+b*(c^d-e)^(f+g*h)-i
 =>+a*b-^-^cde+f*ghi

 A*(B+C)/D
 =>*A/+BCD
 
 (A-(B+C))*D
 =>*-A+BCD
*/
