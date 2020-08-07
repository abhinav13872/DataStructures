package CONVERSIONS;
import java.util.Scanner;
import java.util.Stack;


public class InfixToPostfix2
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
Stack<Character> s1=new Stack<>();						//STACK
System.out.println("POSTFIX: "+ InfixToPostfix2Util(s1,str));
}
}


public static String InfixToPostfix2Util(Stack s,String exp)			//INFIX_TO_POSTFIX METHOD
{
//STEP-1:-
exp+=')';
//STEP-2:-
s.push('(');

String PE="";									//POSTFIX EXPRESSION

for(int i=0;i<exp.length();i++)
{
char c=exp.charAt(i);

//OPENING BRACES CASE:
if(c == '(') s.push(c);

//OPERANDS CASE:
if(Character.isDigit(c) || Character.isLetter(c))
{
PE+=c;
//System.out.println("PE:"+PE);
}

//OPERATORS CASE:
if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
{
if(!s.isEmpty())
{
char peek=(Character)s.pop();
//System.out.println("PEEK: "+peek);

if(Pres(peek) >= Pres(c))
{      
while(peek != '(')
{
PE+=peek;
//System.out.println("PE: "+PE);
peek=(Character)s.pop();
//System.out.println("POPPED: "+peek);
}
}
//System.out.println("#PUSHED: "+peek);
s.push(peek);
}
//System.out.println("Pushed to stack: "+c);
s.push(c);
}

//CLOSING BRACES CASE:
if(!s.isEmpty() && c == ')')
{  
char peek=(Character)s.pop();      
while(!s.isEmpty() && peek != '(')
{
PE+=peek;
//System.out.println("PE:"+PE);
peek=(Character)s.pop();
}
}
//System.out.println();
}
return PE;
}


public static int Pres(char c)
{
if(c == '+' || c == '-') return 1;
if(c == '*' || c == '/') return 2;
if(c == '^') return 3;
return 0;
}
}
//INFIX TO POSTFIX [WITHOUT USING PREDEFINED PEEK()]
/*
#TESTCASES:-

2
((x+y)^a)+((x-c)/b)
a+b*(c^d-e)^(f+g*h)-i

0

2
A*(B+C)/D
(A-(B+C))*D
*/
