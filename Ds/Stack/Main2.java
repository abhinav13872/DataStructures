package STACK;
import java.util.Scanner;
import java.util.Stack;


public class Main2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int t=Integer.parseInt(sc.nextLine());

while(t-- > 0)
{
System.out.print("EXPRESSION: ");
String str=sc.nextLine();
System.out.println("REVERSALS REQUIRED: "+reversals(str));
}
}


//METHOD-1:-
/*public static int reversals(String str)
{
Stack<Character> s=new Stack<>();				//STACK

//CASE OF ODD LENGTH EXPRESSION:-
if(str.length()%2 != 0) return -1;

//CASE OF EVEN LENGTH EXPRESSION:-
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(c == '[') s.push(c);
if(!s.isEmpty() && c == ']' && s.peek() == '[') s.pop();
else if(c == ']') s.push(c);
}
//NOW STACK WILL HAVE "UNBALANCED EXPRESSION" ELSE NOTHING

int count=0;							//COUNT
while(!s.isEmpty())
{
char A=(Character)s.pop();
char B=(Character)s.pop();

if(A == '[') count++;
if(B == ']') count++;
}
return count;
}*/


//METHOD-2:-
public static int reversals(String str)
{
Stack<Character> s=new Stack<>();				//STACK

//CASE OF ODD LENGTH EXPRESSION:-
if(str.length()%2 != 0) return -1;

//CASE OF EVEN LENGTH EXPRESSION:-
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(c == '[') s.push(c);
if(!s.isEmpty() && c == ']' && s.peek() == '[') s.pop();
else if(c == ']') s.push(c);
}
//NOW STACK WILL HAVE "UNBALANCED EXPRESSION" ELSE NOTHING

//CASE OF UNBALANCED EXPRESSION:-
if(!s.isEmpty())
{
float open=0;							//COUNT OF OPEN BRACES
float close=0;							//COUNT OF CLOSED BRACES

while(!s.isEmpty())
{
char c=s.pop();

if(c == '[') open++;
if(c == ']') close++;
}
return (int)(Math.ceil(open/2)+Math.ceil(close/2));
}

//CASE OF BALANCED EXPRESSION:-
return 0;
}
}
//MIN REVERSALS REQUIRED TO BALANCE THE GIVEN EXPRESSION

/*
TESTCASES:

][[]][[[
=>3

[[[[]]
=>1

[[[
=>-1

[][]
=>0

[[[[
=>2

[]
=>0

][
=>2
*/
